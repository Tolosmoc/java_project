import javax.swing.*;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args){
        System.out.println("Program activated.");

        // Create window from Window.java
        Window wind = new Window();
        // show window
        wind.setVisible(true);
        if(1==0) {
            WindowHelp help = new WindowHelp();
        }
        if(1==0) {
            WindowConfirm confirm = new WindowConfirm();
        }
    }
}
