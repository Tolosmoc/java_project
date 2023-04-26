package clone;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Directory {
    private String path;
    private String name;
    private List<Document> documentList;
    private List<Directory> directoryList;

    public void delete() {
        for(Document doc : documentList) {
            doc.delete();
        }
        for(Directory dir : directoryList) {
            (new File(dir.path)).delete();
            dir.delete();
        }
        (new File(path)).delete();
    }
    public void cloneTo(String path) throws IOException {
        File directory = new File(path + '\\' + name);
        if (directory.isDirectory()) (new Directory(directory.getAbsolutePath())).delete();
        if (directory.mkdir()) {
            for(Document doc : documentList) doc.saveTo(directory.getAbsolutePath());
            for(Directory dir : directoryList) dir.cloneTo(directory.getAbsolutePath());
        }
    }

    public Directory(String path) {
        File directory = new File(path);
        this.path = path;
        this.name = directory.getName();
        this.documentList = new ArrayList<>();
        this.directoryList = new ArrayList<>();
        if (directory.isDirectory()) {
            for(File file : Objects.requireNonNull(directory.listFiles())) {
                if (file.isFile()) this.documentList.add(new Document(file.getAbsolutePath()));
                else if (file.isDirectory()) this.directoryList.add(new Directory(file.getAbsolutePath()));
            }
        }
    }
}
