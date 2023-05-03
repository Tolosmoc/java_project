package Swing;

import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;


public class software extends JFrame {
    public software() {
        initComponents();
    }

    private void initComponents() {
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        textArea1 = new JTextArea();
        textField1 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        buttonBar = new JPanel();
        button6 = new JButton();
        okButton = new JButton();

        setTitle("JavaBox");
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        {
            dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border.
            EmptyBorder( 0, 0, 0, 0) , "", javax. swing. border. TitledBorder. CENTER, javax. swing
            . border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ),
            java. awt. Color. red) ,dialogPane. getBorder( )) ); dialogPane. addPropertyChangeListener (new java. beans. PropertyChangeListener( )
            { @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .getPropertyName () ))
            throw new RuntimeException( ); }} );
            dialogPane.setLayout(new BorderLayout());

            {
                contentPanel.setLayout(new MigLayout(
                    "fill,insets dialog,hidemode 3,align center center",
                    // columns
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]",
                    // rows
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]"));

                textArea1.setText("Target path:");
                textArea1.setEditable(false);
                contentPanel.add(textArea1, "cell 1 1 2 1");

                textField1.setEditable(false);
                contentPanel.add(textField1, "cell 3 1 2 1");

                button1.setText("Choose...");
                contentPanel.add(button1, "cell 6 1");

                button2.setText("Synchro");
                contentPanel.add(button2, "cell 2 3");

                button3.setText("Timer");
                contentPanel.add(button3, "cell 3 3");

                button4.setText("Zip");
                contentPanel.add(button4, "cell 4 3");

                button5.setText("Disconnect");
                contentPanel.add(button5, "cell 6 3");
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            {
                buttonBar.setLayout(new MigLayout(
                    "insets dialog,alignx right",
                    // columns
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[button,fill]",
                    // rows
                    null));

                button6.setText("History");
                buttonBar.add(button6, "cell 0 0");

                okButton.setText("OK");
                buttonBar.add(okButton, "cell 12 0");
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JTextArea textArea1;
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JPanel buttonBar;
    private JButton button6;
    private JButton okButton;
    // JFormDesigner - End of variables declaration
}
