import java.awt.*;
import javax.swing.*;

public class Window  extends JFrame {
    public Window() {
        // Title
        this.setTitle("Java Project");
        // Size
        this.setSize(600, 250);
        // position center
        this.setLocationRelativeTo(null);
        // closs option
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // init JPanel
        JPanel pan = new JPanel();
        // Background
        pan.setBackground(Color.ORANGE);
        // set Panel
        this.setContentPane(pan);
        // add


        // init JLabel
        JLabel label = new JLabel("Directory :");
        pan.add(label);

        // init space
        JLabel space = new JLabel("");

        // init JTextField
        JTextField name = new JTextField(10);
        pan.add(name);

        // add space
        pan.add(space);

        // init JButton
        JButton button = new JButton("Validate");
        button.setBounds(100,100,300,40);
        this.add(button);

        this.setLayout(new GridLayout(2, 2));

        this.pack();
        System.out.println("Window created.");
    }
}