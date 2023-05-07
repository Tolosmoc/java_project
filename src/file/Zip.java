package file;

import java.io.*;
import java.util.zip.*;

public class Zip {
    public static void zipFile(String target, String source) throws IOException {
        Directory targetDirectory = new Directory(source);
        try {
            FileOutputStream fos = new FileOutputStream(target + "\\" + targetDirectory.getName() + ".zip");
            ZipOutputStream zos = new ZipOutputStream(fos);

            for (Document doc : targetDirectory.getDocs()) {
                File srcFile = new File(doc.getPath());
                FileInputStream fis = new FileInputStream(srcFile);
                zos.putNextEntry(new ZipEntry(srcFile.getName()));

                byte[] buf = new byte[1024];
                int len;
                while ((len = fis.read(buf)) > 0) {
                    zos.write(buf, 0, len);
                }
                zos.closeEntry();
                fis.close();
            }
            zos.close();
        }
        catch(IOException ioe){
            System.out.println("Error creating zip file: " + ioe);
        }
    }
}
