package java_assignment;
import java.io.*;
public class FileHandlingAssignment2 {

    public static void main(String[] args) {

        File file = new File("/home/surenj");
        File[] fileList = file.listFiles();
        for (File files :fileList) {
            if(files.isFile())
            System.out.println(files);
            
        }
    }
}
