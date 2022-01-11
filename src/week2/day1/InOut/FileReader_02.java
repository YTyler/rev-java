package week2.day1.InOut;

import week2.day1.Employee;

import java.io.*;

public class FileReader_02 {
    public static void main(String[] args) {
        try{
            FileInputStream fileInputStream = new FileInputStream("employee.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Employee employee = (Employee)objectInputStream.readObject();
            System.out.println("Content from the file");
            System.out.println(employee);
            objectInputStream.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("Thank you!!!");

    }
}
