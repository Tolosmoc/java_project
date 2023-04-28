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
    public void saveTo(String path) throws IOException {
        File directory = new File(path + "\\" + this.name);
        if (directory.mkdir()) {
            for (Document doc : docs) doc.saveTo(directory.getAbsolutePath());
            for (Directory dir : dirs) dir.saveTo(directory.getAbsolutePath());
        }
    }
}
