package clone;

import java.io.File;
import java.io.IOException;

public class Timer extends Thread {
    private Integer duration;
    private String source;
    private String target;

    public Timer(Integer duration, String source, String target) {
        this.duration = duration;
        this.source = source;
        this.target = target;
    }

    public void run() {
        if ((new File(this.source)).isDirectory() && (new File(target)).isDirectory()) {
            try {
                while(true) {
                    new Directory(source).cloneTo(this.target);
                    sleep(duration);
                }
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
