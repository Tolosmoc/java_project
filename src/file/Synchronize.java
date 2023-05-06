package file;

import java.io.IOException;

public class Synchronize extends Thread {
    private Directory source;
    private Directory target;

    public Synchronize(String source, String target) throws IOException {
        this.source = new Directory(source);
        this.target = new Directory(target);
    }


}
