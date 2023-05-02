package clone;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Document {
    private String name;
    private String path;
    private Directory parent;
    private long date;
    private byte[] content;

    public String getName() {return name;}
    public String getPath() {return path;}
    public Directory getParent() {return parent;}
    public long getDate() {return date;}
    public byte[] getContent() {return content;}

    public Document(String name, String path, Directory parent, long date, byte[] content) {
        this.name = name;
        this.path = path;
        this.parent = parent;
        this.date = date;
        this.content = content;
    }
    public Document(String path, Directory parent) throws IOException {
        File file = new File(path);
        this.name = file.getName();
        this.path = file.getAbsolutePath();
        this.parent = parent;
        this.date = file.lastModified();
        this.content = Files.readAllBytes(Path.of(file.getAbsolutePath()));
    }
    public Document(String path) throws IOException {
        File file = new File(path);
        this.name = file.getName();
        this.path = file.getAbsolutePath();
        this.parent = null;
        this.date = file.lastModified();
        this.content = Files.readAllBytes(Path.of(file.getAbsolutePath()));
    }

    public boolean delete() {
        return (new File(path)).delete();
    }
    public boolean equals(Object other) {return ((Document) other).getName().equals(this.name) && ((Document) other).getDate() == this.date;}
    public void saveTo(String path) throws IOException {
        File directory = new File(path);
        if (directory.isDirectory()) {
            Files.write(Path.of(path + "\\" + this.name), this.content);
            (new File(path + "\\" + this.name)).setLastModified(this.date);
        }
    }
}
