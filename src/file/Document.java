package file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;

public class Document {
    private String name;
    private String path;
    private Directory parent;
    private long date;

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public Directory getParent() {
        return parent;
    }

    public long getDate() {
        return date;
    }

    public void setParent(Directory parent) {
        this.parent = parent;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public Document(String name, String path, Directory parent, long date) {
        this.name = name;
        this.path = path;
        this.parent = parent;
        this.date = date;
    }

    public Document(String path, Directory parent) {
        File file = new File(path);
        this.name = file.getName();
        this.path = file.getAbsolutePath();
        this.parent = parent;
        this.date = file.lastModified();
    }

    public Document(String path) {
        File file = new File(path);
        this.name = file.getName();
        this.path = file.getAbsolutePath();
        this.parent = null;
        this.date = file.lastModified();
    }

    public boolean delete() {
        return (new File(path)).delete();
    }

    public boolean equals(Object other) {
        return ((Document) other).getName().equals(this.name) && ((Document) other).getDate() == this.date;
    }

    public void saveTo(String path) {
        File directory = new File(path);
        if (directory.isDirectory()) {
            try {
                Files.copy(Path.of(this.path), Path.of(path + "\\" + this.name), COPY_ATTRIBUTES);
            } catch (IOException ignored) {}
        }
    }
}
