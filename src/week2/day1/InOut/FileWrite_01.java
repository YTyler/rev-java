package week2.day1.InOut;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite_01 {
    public static void main(String[] args) {
        String name = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
                "It has survived not only five centuries, but also the leap into electronic typesetting, " +
                "remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset " +
                "sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like " +
                "Aldus PageMaker including versions of Lorem Ipsum.";
        System.out.println("Trying to write string into file");
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("file1.dat");
            byte[] arr = name.getBytes();
            fileOutputStream.write(arr);
            fileOutputStream.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("Completed");
    }
}
