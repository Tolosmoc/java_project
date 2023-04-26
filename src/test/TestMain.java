import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestMain extends directoryReader /*Zip*/{

    static String synchroPath = ""; // Specify the absolute path of the synchronization directory
    static String Path = ""; // Fill in the absolute path of the directory to be synchronized

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
        Source fichier;
        fichier = fileChooser.choose();
        String filePath;
        filePath = fichier.toString();
        System.out.println(filePath);
        String fileName = fichier.getName();
        System.out.println(fileName);
        try {
            System.out.println("Zipping" + fileName + " to" + (filePath.substring(0, filePath.length()-3)) + ".zip");
            Source zippedFile = Zip(fileName, filePath, "test.zip");
            System.out.println("Zipped : " + zippedFile.getAbsolutePath());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
    }
}
