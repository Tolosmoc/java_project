package clone;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Document {
    private String name;
    private String path;
    private String parent;
    private long lastModified;

    public void delete() {
        (new File(path)).delete();
    }
    public void saveTo(String path) throws IOException {
        File source = new File(this.path);
        if (source.isFile()) Files.write(Path.of(path + '\\' + this.name), Files.readAllBytes(Path.of(this.path)));
        new File(path).setLastModified(this.lastModified);
    }
    public Document(String path) {
        File file = new File(path);
        this.name = file.getName();
        this.path = file.getAbsolutePath();
        this.parent = file.getParent();
        this.lastModified = file.lastModified();
    }
}
