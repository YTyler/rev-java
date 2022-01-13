package week2.day4.part2JDBC.app;

import java.sql.*;
import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/RevJan2022";
        String username = "root";
        String password = "root";

        Connection conn = null;
        PreparedStatement pstmt = null;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id : ");
        int slno = sc.nextInt();
        System.out.print("Enter first name : ");
        String firstname = sc.next();
        System.out.print("Enter last name : ");
        String lastname = sc.next();
        System.out.print("Enter email : ");
        String email = sc.next();

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
            pstmt = conn.prepareStatement("INSERT INTO student VALUES(?,?,?,?)");
            pstmt.setInt(1, slno);
            pstmt.setString(2, firstname);
            pstmt.setString(3, lastname);
            pstmt.setString(4, email);
            int norec = pstmt.executeUpdate();
            if(1==norec){
                System.out.println("Inserted successfully");
            }
            else{
                System.out.println("Failed to insert");
            }

        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            try {
                pstmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
