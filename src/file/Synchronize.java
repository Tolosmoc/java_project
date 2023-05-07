package file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Synchronize extends Thread {
    private static List<Synchronize> threads = new ArrayList<>();

    public static Synchronize getSync(Directory source) {
        for (Synchronize sync : threads) {
            if (sync.getSource() == source) {
                return sync;
            }
        } return null;
    }

    private boolean state = false;
    private final Directory source;
    private final Directory target;

    public boolean getSate() {return this.state;}
    public Directory getSource() {return this.source;}
    public Directory getTarget() {return this.target;}

    public Synchronize(String source, String target) {
        this.source = new Directory(source);
        this.target = new Directory(target);
        Synchronize.threads.add(this);
    }
    public Synchronize(Directory source, Directory target) {
        this.source = target;
        this.target = source;
        Synchronize.threads.add(this);
    }

    public Synchronize inverse() {
        return new Synchronize(this.source, this.target);
    }
    public void init() {
        for (Document doc : source.getDocs()) {
            doc.saveTo(target.getPath());
        }
        for (Directory dir : source.getDirs()) {
            dir.saveTo(target.getPath());
        }
    }
    public void run() {
        if ((new File(this.source.getPath())).isDirectory() && (new File(this.target.getPath())).isDirectory()) {
            try {
                while(true) {
                    source.scan();
                    if (!source.getUpdated()) {
                        while (Objects.requireNonNull(Synchronize.getSync(this.target)).getSate()) {
                            sleep(1);
                        }
                        this.state = true;
                        source.update();
                        source.cloneTo(target.getPath());
                        this.state = false;
                    }
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
