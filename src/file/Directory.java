package file;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.Objects;

public class Directory {
    private String name;
    private String path;
    private Directory parent;
    private long date;
    private List<Document> docs;
    private List<Directory> dirs;
    private boolean updated = true;

    public String getName() {return name;}
    public String getPath() {return path;}
    public Directory getParent() {return parent;}
    public long getDate() {return date;}
    public List<Document> getDocs() {return docs;}
    public List<Directory> getDirs() {return dirs;}
    public boolean getUpdated() {return updated;}

    public void setUpdated(boolean updated) {
        if (this.parent == null) this.updated = updated;
        else this.parent.setUpdated(updated);
    }

    public void setParent(Directory parent) {this.parent = parent;}

    public Directory(String path, Directory parent) {
        File directory = new File(path);
        this.name = directory.getName();
        this.path = directory.getAbsolutePath();
        this.parent = parent;
        this.date = directory.lastModified();
        this.docs = new ArrayList<>();
        this.dirs = new ArrayList<>();

        if (directory.isDirectory() && directory.listFiles() != null) {
            for (File file : Objects.requireNonNull(directory.listFiles())) {
                if (file.isFile()) this.docs.add(new Document(file.getAbsolutePath(), this));
                else if (file.isDirectory()) this.dirs.add(new Directory(this.path + "\\" + file.getName(), this));
            }
        }
    }
    public Directory(String path) {
        File directory = new File(path);
        this.name = directory.getName();
        this.path = directory.getAbsolutePath();
        this.parent = null;
        this.date = directory.lastModified();
        this.docs = new ArrayList<>();
        this.dirs = new ArrayList<>();

        if (directory.isDirectory() && directory.listFiles() != null) {
            for (File file : Objects.requireNonNull(directory.listFiles())) {
                if (file.isFile()) this.docs.add(new Document(file.getAbsolutePath(), this));
                else if (file.isDirectory()) this.dirs.add(new Directory(this.path + "\\" + file.getName(), this));
            }
        }
    }

    public boolean removeDoc(Document document) {return this.docs.remove(document);}
    public boolean removeDir(Directory directory) {return this.dirs.remove(directory);}
    public void addDoc(Document document) {this.docs.add(document);}
    public void addDir(Directory directory) {this.dirs.add(directory);}
    public boolean delete() {
        for (Document doc : docs) doc.delete();
        for (Directory dir : dirs) {
            dir.delete();
        }
        return (new File(path)).delete();
    }
    public boolean containsDoc(String name) {
        for (Document doc : docs) {
            if (doc.getName().equals(name)) return true;
        }
        return false;
    }
    public boolean containsDoc(String name, long date) {
        for (Document doc : docs) {
            if (doc.getName().equals(name) && doc.getDate() == date) return true;
        }
        return false;
    }
    public boolean containsDir(String name) {
        for (Directory dir : dirs) {
            if (dir.getName().equals(name)) return true;
        }
        return false;
    }
    public boolean containsDir(String name, long date) {
        for (Directory dir : dirs) {
            if (dir.getName().equals(name) && dir.getDate() == date) return true;
        }
        return false;
    }
    public Document getDocument(String name) {
        for (Document doc : docs) {
            if (doc.getName().equals(name)) return doc;
        }
        return null;
    }
    public void saveTo(String path) {
        if (parent == null) {
            File directory = new File(path);
            for (Document doc : docs) doc.saveTo(directory.getAbsolutePath());
            for (Directory dir : dirs) dir.saveTo(directory.getAbsolutePath());
        } else {
            File directory = new File(path + "\\" + this.name);
            if (directory.mkdir()) {
                for (Document doc : docs) doc.saveTo(directory.getAbsolutePath());
                for (Directory dir : dirs) dir.saveTo(directory.getAbsolutePath());
            }
        }
    }
    public void cloneTo(String path) {
        File directory;
        if (this.parent == null) directory = new File(path);
        else directory = new File(path + "\\" + this.name);
        if (directory.isDirectory()) {
            Directory targetDirectory = null;
            targetDirectory = new Directory(directory.getAbsolutePath());
            for (Document doc : targetDirectory.getDocs()) {
                if (!this.containsDoc(doc.getName())) doc.delete();
            }
            for (Directory dir : targetDirectory.getDirs()) {
                if (!this.containsDir(dir.getName())) dir.delete();
            }
            for (Document doc : docs) {
                if (targetDirectory.containsDoc(doc.getName())) {
                    Document targetDocument = targetDirectory.getDocument(doc.getName());
                    if (!doc.equals(targetDocument)) {
                        targetDocument.delete();
                        doc.saveTo(targetDirectory.getPath());
                    }
                } else doc.saveTo(targetDirectory.getPath());
            }
            for (Directory dir : dirs) {
                if (dir.getDate() != targetDirectory.getDate()) dir.cloneTo(targetDirectory.getPath());
            }
        } else this.saveTo(path);
    }
    public void update() {
        Directory newDir = null;
        newDir = new Directory(this.path);
        this.docs = newDir.getDocs();
        this.dirs = newDir.getDirs();
        this.updated = true;
        for (Document doc : this.docs) doc.setParent(this);
        for (Directory dir : this.dirs) dir.setParent(this);
    }
    public void scan() {
        if ((new File(this.path)).isDirectory()) {
            Directory source = null;
            source = new Directory(this.path);
            for (Document doc : source.getDocs()) {
                if (!this.containsDoc(doc.getName(), doc.getDate())) {
                    this.setUpdated(false);
                    return;
                }
            }
            for (Document doc : this.docs) {
                if (!source.containsDoc(doc.getName(), doc.getDate())) {
                    this.setUpdated(false);
                    return;
                }
            }
            for (Directory dir : source.getDirs()) {
                if (!this.containsDir(dir.getName(), dir.getDate())) {
                    this.setUpdated(false);
                    return;
                }
            }
            for (Directory dir : this.dirs) {
                if (!source.containsDir(dir.getName(), dir.getDate())) {
                    this.setUpdated(false);
                    return;
                }
                dir.scan();
            }
        }
    }
}
