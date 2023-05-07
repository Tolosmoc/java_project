package file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;

public class Document {
    /*
     * Basic representation of a file, which allows some operations to be done
     */

    /* ATTRIBUTES */
    private String name;
    private String path;
    private Directory parent;
    private long date;

    /* GETTERS */
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

    /* SETTERS */
    public void setParent(Directory parent) {
        this.parent = parent;
    }
    public void setDate(long date) {
        this.date = date;
    }

    /* CONSTRUCTORS */
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

    /* OPERATIONS */
    public boolean delete() {
        /* Delete the file from the disk */
        return (new File(path)).delete();
    }

    public boolean equals(Object other) {
        /* Override the equals method to check if files are equal based on their name and date */
        return ((Document) other).getName().equals(this.name) && ((Document) other).getDate() == this.date;
    }

    public void saveTo(String path) {
        /* Save the file to the given path on disk */
        File directory = new File(path);
        if (directory.isDirectory()) {
            try {
                Files.copy(Path.of(this.path), Path.of(path + "\\" + this.name), COPY_ATTRIBUTES);
            } catch (IOException ignored) {}
        }
    }
}
