package file;

import java.io.File;

public class Clone extends Thread {
    private Integer duration;
    private Directory source;
    private Directory target;

    public Clone(String source, String target) {
        this.duration = 0;
        this.source = new Directory(source);
        this.target = new Directory(target);
    }
    public Clone(Integer duration, String source, String target) {
        this.duration = duration;
        this.source = new Directory(source);
        this.target = new Directory(target);
    }

    public void run() {
        if ((new File(this.source.getPath())).isDirectory() && (new File(this.target.getPath())).isDirectory()) {
            try {
                while(true) {
                    this.source.update();
                    this.source.cloneTo(this.target.getPath());
                    sleep(duration);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void doOnce() {
        if ((new File(this.source.getPath())).isDirectory() && (new File(this.target.getPath())).isDirectory()) {
            this.source.cloneTo(this.target.getPath());
        }
    }
}
