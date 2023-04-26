import clone.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String source = "C:\\Users\\pgien\\Documents\\Cours\\Semestre 6\\Object-Oriented Programming with Java\\Projet Java\\java_project\\debug\\source";
        String target = "C:\\Users\\pgien\\Documents\\Cours\\Semestre 6\\Object-Oriented Programming with Java\\Projet Java\\java_project\\debug\\target";

        Directory directory = new Directory(source);
        try {
            directory.cloneTo(target);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
