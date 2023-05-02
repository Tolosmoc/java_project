import clone.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String source = "C:\\Users\\pgien\\Documents\\Cours\\Semestre 6\\Object-Oriented Programming with Java\\Projet Java\\java_project\\.debug\\source";
        String target = "C:\\Users\\pgien\\Documents\\Cours\\Semestre 6\\Object-Oriented Programming with Java\\Projet Java\\java_project\\.debug\\target";

        new Timer(1000, source, target).start();
    }
}
