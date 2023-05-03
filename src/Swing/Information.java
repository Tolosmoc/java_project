package Swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;

public class Information extends JFrame {
    public Information() {
        initComponents();
    }

    private void initComponents() {
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        textField1 = new JTextField();
        textPane1 = new JTextPane();
        buttonBar = new JPanel();
        button1 = new JButton();
        Close = new Close();

        setTitle("Swing.Information");
        setAlwaysOnTop(true);
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        {
            dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing
            . border. EmptyBorder( 0, 0, 0, 0) , "", javax. swing. border. TitledBorder
            . CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069al\u006fg" ,java .
            awt .Font .BOLD ,12 ), java. awt. Color. red) ,dialogPane. getBorder( )) )
            ; dialogPane. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
            ) {if ("\u0062or\u0064er" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} )
            ;
            dialogPane.setLayout(new BorderLayout());

            {
                contentPanel.setLayout(new MigLayout(
                    "fill,insets dialog,hidemode 3,align center center",
                    // columns
                    "[fill]" +
                    "[fill]" +
                    "[fill]",
                    // rows
                    "[]" +
                    "[]" +
                    "[]"));

                textField1.setText("Welcome to [name].");
                textField1.setEditable(false);
                textField1.setBorder(null);
                textField1.setFont(new Font("Segoe UI", Font.BOLD, 20));
                contentPanel.add(textField1, "cell 1 0,align center top,grow 0 0");

                textPane1.setText("[Name] is synchronization application\ncreated  by  Pierre GIEN  and Guilhem\nLACASSAGNE.");
                textPane1.setEditable(false);
                contentPanel.add(textPane1, "cell 1 1,aligny top,grow 100 0");
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            {
                buttonBar.setLayout(new MigLayout(
                    "insets dialog,alignx right",
                    // columns
                    "[button,fill]",
                    // rows
                    null));

                button1.setAction(Close);
                buttonBar.add(button1, "cell 0 0");
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
    }

    private JPanel dialogPane;
    private JPanel contentPanel;
    private JTextField textField1;
    private JTextPane textPane1;
    private JPanel buttonBar;
    private JButton button1;
    private Close Close;

    private class Close extends AbstractAction {
        private Close() {
            putValue(NAME, "Ok");
        }

        public void actionPerformed(ActionEvent e) {
            Information.this.dispose() ;
        }
    }
}
