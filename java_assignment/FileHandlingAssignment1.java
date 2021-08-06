package java_assignment;
import java.io.*;

public class FileHandlingAssignment1 {

    public static void main(String[] args)  {
        File folder = new File("//home//surenj//Documents//javaFileHandling");
        folder.mkdir();

        File file = new File("//home//surenj//Documents//javaFileHandling//java.txt");

        try {
            file.createNewFile();
            boolean isFileCreated = file.exists();
            System.out.println("The File was Created: "+isFileCreated);
// file write
        FileWriter write = new FileWriter(file);
        write.write("Java Assignment 2020");
        write.flush();
        write.close();
// file read
        FileReader fileRead = new FileReader(file);
        BufferedReader read = new BufferedReader(fileRead);
        String line = read.readLine();
            System.out.println(" line1 is: "+line);

// file info
            if(file.exists()){
                System.out.println("File Name: " + file.getName());
                System.out.println("Absolute Path: " + file.getAbsolutePath());
                System.out.println("Writeable: " + file.canWrite());
                System.out.println("is This File Readable: " + file.canRead());
                System.out.println("File Size (in Bytes): " + file.length());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

