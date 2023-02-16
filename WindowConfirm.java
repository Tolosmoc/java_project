import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;

public class WindowConfirm extends JFrame {
    public WindowConfirm() {
        // Title
        this.setTitle("Confirm");
        // Size
        this.setSize(300, 300);
        // No resize
        this.setResizable(false);
        // position center
        this.setLocationRelativeTo(null);
        // on top
        this.setAlwaysOnTop(false);
        // No decoration
        this.setUndecorated(false);
        // / Background
        // /this.setBackground(Color.blue);
        // show window
        this.setVisible(true);

        System.out.println("Confirm window created.");
    }
}