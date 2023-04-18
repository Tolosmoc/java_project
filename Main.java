import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.*;

public class Main extends directoryReader /*Zip*/{

    static String synchroPath = "C:\\Users\\hecto\\OneDrive\\Documents\\Cours-1A\\Java\\Projet\\Projet-java-v1\\v1.1\\Synchro-Test";
    static String Path = "C:\\Users\\hecto\\OneDrive\\Documents\\Cours-1A\\Java\\Projet\\Projet-java-v1\\v1.1\\Test";

    public static void main(String[] args) throws IOException {
        //System.out.println("\\");

        List<String[]> synchroTest = directoryReader(synchroPath, "", new ArrayList<>());
        List<String[]> test = directoryReader(Path, "", new ArrayList<>());

        //System.out.println(test);
        for (int i = 0; i<test.size(); i++) {
            System.out.println(test.get(i)[0]);
        }

        synchroTest = directoryComparator(synchroTest, test);
        //System.out.println("synchro :" + synchroTest);

        /*
        File fichier;
        fichier = fileChooser.choose();
        String filePath;
        filePath = fichier.toString();
        System.out.println(filePath);
        String fileName = fichier.getName();
        System.out.println(fileName);
        try {
            System.out.println("Zipping" + fileName + " to" + (filePath.substring(0, filePath.length()-3)) + ".zip");
            File zippedFile = Zip(fileName, filePath, "test.zip");
            System.out.println("Zipped : " + zippedFile.getAbsolutePath());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
    }
}
