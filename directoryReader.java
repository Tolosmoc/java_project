import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class directoryReader extends directoryComparator{
    public static List<String[]> directoryReader(String path, String parentPath, List<String[]> fileList) throws IOException
    {
        /*
        if (parentPath == "") {
            List<String[]> fileList = new ArrayList<>(); // PROBLEM : REINIT... => dans param func
        }
        */
        File dir  = new File(path);
        File[] list = dir.listFiles();

        for(File item : list){
            if(item.isFile())
            {
                fileList.add(0, new String[]{parentPath + item.getName(), String.valueOf(item.lastModified())});
            }
            else if(item.isDirectory())
            {
                directoryReader(path + "\\" + item.getName(), parentPath + item.getName() +"\\", fileList);
            }
        }
        return fileList;
    }
}