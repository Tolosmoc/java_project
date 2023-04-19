package src;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class directoryComparator {
    public static List<String[]> directoryComparator(List<String[]> synchro, List<String[]> directoryB) throws IOException
    {
        List<String> tmpSN = new ArrayList<>(); // Name file in synchro
        for (int i = 0 ; i<synchro.size(); i++){
            tmpSN.add(synchro.get(i)[0]);
        }

        for (String[] item : directoryB){
            if (tmpSN.contains(item[0])){
                int indexA = tmpSN.indexOf(item[0]);
                if (Double.parseDouble(item[1]) > Double.parseDouble(synchro.get(indexA)[1])){
                    synchro.remove(synchro.get(indexA));
                    synchro.add(item);
                    System.out.println(">B  " + item[0]);
                }
                else {
                    System.out.println(">A  " + item[0]);
                }
                tmpSN.remove(item[0]);
            }
            else{
                synchro.add(item);
                System.out.println(" +  " + item[0]);
            }
        }

        for (String fileName : tmpSN){
            System.out.println(" -  " + fileName);
        }

        return synchro;
    }
}
