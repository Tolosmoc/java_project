package file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Synchronize extends Thread {
    /*
     * Synchronize class - Used to copy back and forth two folders in real time.
     * Two objects are needed to have a bidirectional copy.
     */

    /* STATIC */
    private static List<Synchronize> threads = new ArrayList<>();

    public static Synchronize getSync(Directory source) {
        /* Get the opposite Synchronize object based on source folder */
        for (Synchronize sync : threads) {
            if (sync.getSource() == source) {
                return sync;
            }
        } return null;
    }

    /* ATTRIBUTES */
    private boolean state = false;
    private final Directory source;
    private final Directory target;

    /* GETTERS */
    public boolean getSate() {return this.state;}
    public Directory getSource() {return this.source;}
    public Directory getTarget() {return this.target;}

    /* CONSTRUCTORS */
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

    /* OPERATIONS */
    public Synchronize inverse() {
        /* Returns the opposite Synchronize object in order to clone in the other direction */
        return new Synchronize(this.source, this.target);
    }
    public void init() {
        /* Initialise both folders in order to start the cloning */
        for (Document doc : source.getDocs()) {
            doc.saveTo(target.getPath());
        }
        for (Directory dir : source.getDirs()) {
            dir.saveTo(target.getPath());
        }
    }
    public void run() {
        /* Clone in real time the source folder to the target path, only if changes are detected */
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
