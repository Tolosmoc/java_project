import javax.swing.*;
import javax.swing.JFrame;

public class WindowHelp extends JFrame {
    public WindowHelp() {
        // Title
        this.setTitle("Help");
        // Size
        this.setSize(300, 300);
        // No resize
        this.setResizable(false);
        // position center
        this.setLocationRelativeTo(null);
        // show window
        this.setVisible(true);

        System.out.println("Help window created.");
    }
}
