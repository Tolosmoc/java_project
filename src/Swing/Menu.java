package Swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;

import java.lang.*;

public class Menu extends JFrame {
    JFrame frameInfo = new Information();

    public Menu() {
        initComponents();
    }

    private void initComponents() {
        textArea1 = new JTextArea();
        menuBar1 = new JMenuBar();
        button2 = new JButton();
        button3 = new JButton();
        dialogPane = new JPanel();
        buttonBar = new JPanel();
        button4 = new JButton();
        panel1 = new JPanel();
        textArea4 = new JTextArea();
        TFname = new JTextField();
        textArea5 = new JTextArea();
        TFip = new JTextField();
        button1 = new JButton();
        BgColor = new BgColor();
        showHelpWindow = new helpWindow();
        closeProg = new Exit();
        logIn = new logIn();

        //======== this ========
        setTitle("Log in");
        setBackground(Color.white);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationByPlatform(true);
        setPreferredSize(new Dimension(400, 225));
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== menuBar1 ========
        {

            //---- button2 ----
            button2.setAction(BgColor);
            menuBar1.add(button2);

            //---- button3 ----
            button3.setAction(showHelpWindow);
            menuBar1.add(button3);
        }
        setJMenuBar(menuBar1);

        //======== dialogPane ========
        {
            dialogPane.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax .
            swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "" , javax. swing .border
            . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog"
            , java .awt . Font. BOLD ,12 ) ,java . awt. Color .red ) ,dialogPane. getBorder
            () ) ); dialogPane. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java
            . beans. PropertyChangeEvent e) { if( "bord\u0065r" .equals ( e. getPropertyName () ) )throw new RuntimeException
            ( ) ;} } );
            dialogPane.setLayout(new BorderLayout());

            //======== buttonBar ========
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
                    "[button,fill]" +
                    "[button,fill]",
                    // rows
                    null));

                //---- button4 ----
                button4.setAction(closeProg);
                buttonBar.add(button4, "cell 9 0");
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);

            //======== panel1 ========
            {
                panel1.setLayout(new MigLayout(
                    "fill,hidemode 3,alignx center",
                    // columns
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
                    "[]" +
                    "[]"));

                //---- textArea4 ----
                textArea4.setText("Name:");
                textArea4.setEditable(false);
                textArea4.setForeground(new Color(0x666666));
                textArea4.setEnabled(false);
                textArea4.setBorder(null);
                panel1.add(textArea4, "cell 1 1 2 1,alignx center,growx 0");
                panel1.add(TFname, "cell 3 1 3 1");

                //---- textArea5 ----
                textArea5.setText("IP:");
                textArea5.setEditable(false);
                textArea5.setEnabled(false);
                textArea5.setBorder(null);
                panel1.add(textArea5, "cell 1 2 2 1,alignx center,growx 0");
                panel1.add(TFip, "cell 3 2 3 1");

                //---- button1 ----
                button1.setAction(logIn);
                panel1.add(button1, "cell 2 4 3 1");
            }
            dialogPane.add(panel1, BorderLayout.CENTER);
        }
        contentPane.add(dialogPane);
        dialogPane.setBounds(0, 0, 403, 193);

        {
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFYe
    private JTextArea textArea1;
    private JMenuBar menuBar1;
    private JButton button2;
    private JButton button3;
    private JPanel dialogPane;
    private JPanel buttonBar;
    private JButton button4;
    private JPanel panel1;
    private JTextArea textArea4;
    private JTextField TFname;
    private JTextArea textArea5;
    private JTextField TFip;
    private JButton button1;
    private BgColor BgColor;
    private helpWindow showHelpWindow;
    private Exit closeProg;
    private logIn logIn;
    // JFormDesigner - End of variables declaration

    private class BgColor extends AbstractAction {
        private Color bgColor = Color.white;
        private BgColor() {
            putValue(NAME, "W/B");
        }

        public void actionPerformed(ActionEvent e) {
            if (bgColor == Color.white){
                bgColor = Color.black;
            }
            else{
                bgColor = Color.white;
            }
            buttonBar.setBackground(bgColor);
            dialogPane.setBackground(bgColor);
            menuBar1.setBackground(bgColor);
            panel1.setBackground(bgColor);
            repaint();
        }
    }

    private class helpWindow extends AbstractAction {
        private helpWindow() {
            putValue(NAME, "?");
        }

        public void actionPerformed(ActionEvent e) {
            frameInfo.setVisible(!frameInfo.isVisible());
        }
    }

    private class Exit extends AbstractAction {
        private Exit() {
            putValue(NAME, "Exit");
        }

        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    private class logIn extends AbstractAction {
        private logIn() {
            putValue(NAME, "logIn");
        }

        public void actionPerformed(ActionEvent e) {
            if (!(TFname.getText().isEmpty() || TFip.getText().isEmpty())) {
                String name = TFname.getText();
                String ip = TFip.getText();
                dispose();
                /*
                JFrame frameSoftware = new software();
                frameSoftware.setVisible(true);
                */
            }
        }
    }
}
