package file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Synchronize extends Thread {
    public class History {
        public class Document {
            private String name;
            private String path;
            private long date;

            public String getName() {return name;}
            public String getPath() {return path;}
            public long getDate() {return date;}

            public Document(String path) {
                File directory = new File(path);
                this.name = directory.getName();
                this.path = directory.getAbsolutePath();
                this.date = directory.lastModified();
            }
        }
        public class Directory {
            private String name;
            private String path;
            private long date;
            private List<Document> docs;
            private List<Directory> dirs;

            public String getName() {return name;}
            public String getPath() {return path;}
            public long getDate() {return date;}

            public Directory(String path) {
                File directory = new File(path);
                this.name = directory.getName();
                this.path = directory.getAbsolutePath();
                this.date = directory.lastModified();
            }
        }

        private String path;
        private List<Document> docs;
        private List<Directory> dirs;

        public History(String path) {
            File directory = new File(path);
            this.path = path;
            this.docs = new ArrayList<>();
            this.dirs = new ArrayList<>();

            for (File file : directory.listFiles()) {
                if (file.isFile()) this.docs.add(new Document(file.getAbsolutePath()));
                else if (file.isDirectory()) this.dirs.add(new Directory(file.getAbsolutePath()));
            }
        }
    }
}
