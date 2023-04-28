package clone;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.Objects;

public class Directory {
    private String name;
    private String path;
    private Directory parent;
    private List<Document> docs;
    private List<Directory> dirs;

    public String getName() {return name;}
    public String getPath() {return path;}
    public Directory getParent() {return parent;}
    public List<Document> getDocs() {return docs;}
    public List<Directory> getDirs() {return dirs;}

    public Directory(String path, Directory parent) throws IOException {
        File directory = new File(path);
        this.name = directory.getName();
        this.path = directory.getAbsolutePath();
        this.parent = parent;
        this.docs = new ArrayList<>();
        this.dirs = new ArrayList<>();

        if (directory.isDirectory()) {
            for (File file : Objects.requireNonNull(directory.listFiles())) {
                if (file.isFile()) this.docs.add(new Document(file.getAbsolutePath(), this));
                else if (file.isDirectory()) this.dirs.add(new Directory(this.path + "\\" + file.getName(), this));
            }
        }
    }
    public Directory(String path) throws IOException {
        File directory = new File(path);
        this.name = directory.getName();
        this.path = directory.getAbsolutePath();
        this.parent = null;
        this.docs = new ArrayList<>();
        this.dirs = new ArrayList<>();

        if (directory.isDirectory()) {
            for (File file : Objects.requireNonNull(directory.listFiles())) {
                if (file.isFile()) this.docs.add(new Document(file.getAbsolutePath(), this));
                else if (file.isDirectory()) this.dirs.add(new Directory(this.path + "\\" + file.getName(), this));
            }
        }
    }

    public boolean delete() {
        for (Document doc : docs) doc.delete();
        for (Directory dir : dirs) dir.delete();
        return (new File(path)).delete();
    }
    public boolean contains(String name) {
        for (Document doc : docs) {
            if (doc.getName().equals(name)) return true;
        }
        return false;
    }
    public Document getDocument(String name) {
        for (Document doc : docs) {
            if (doc.getName().equals(name)) return doc;
        }
        return null;
    }
    public void saveTo(String path) throws IOException {
        File directory = new File(path + "\\" + this.name);
        if (directory.mkdir()) {
            for (Document doc : docs) doc.saveTo(directory.getAbsolutePath());
            for (Directory dir : dirs) dir.saveTo(directory.getAbsolutePath());
        }
    }
    public void cloneTo(String path) throws IOException {
        File directory = new File(path + "\\" + this.name);
        if (directory.isDirectory()) {
            Directory targetDirectory = new Directory(directory.getAbsolutePath());
            for (Document doc : docs) {
                if (targetDirectory.contains(doc.getName())) {
                    Document targetDocument = targetDirectory.getDocument(doc.getName());
                    if (!doc.equals(targetDocument)) {
                        targetDocument.delete();
                        doc.saveTo(targetDirectory.getPath());
                    }
                } else doc.saveTo(targetDirectory.getPath());
            }
            for (Directory dir : dirs) {
                dir.cloneTo(targetDirectory.getPath());
            }
        } else this.saveTo(path);
    }
}
