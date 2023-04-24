import java.io.File;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;

class fileChooser {
    public static File choose() throws IOException {
        JFileChooser dialogue = new JFileChooser(new File("."));
        PrintWriter sortie;
        File fichier;

        if (dialogue.showOpenDialog(null)==
                JFileChooser.APPROVE_OPTION) {
            fichier = dialogue.getSelectedFile();
            sortie = new PrintWriter
                    (new FileWriter(fichier.getPath(), true));
            sortie.close();
            System.out.println(fichier);
            return (fichier);
        }
        return null;
    }
}