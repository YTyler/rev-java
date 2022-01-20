package week2.day1.InOut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead_01 {
    public static void main(String[] args) {
        System.out.println("Reading file content");
        try{
            FileInputStream fileInputStream = new FileInputStream("file1.dat");
            byte[] arr = new byte[fileInputStream.available()];
            fileInputStream.read(arr);
            String name = new String(arr);
            System.out.println(name);
            fileInputStream.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Completed");

    }
}
