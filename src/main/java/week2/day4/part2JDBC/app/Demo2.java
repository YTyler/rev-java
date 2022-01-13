package week2.day4.part2JDBC.app;

import java.sql.*;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/RevJan2022";
        String username = "root";
        String password = "root";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the id of the student to display : ");
        int id = sc.nextInt();

        Connection conn = null ;
        Statement stmt = null ;
        ResultSet rs = null ;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM student WHERE slno = "+id;
            rs = stmt.executeQuery(sql);
            if(rs.next()){
                int slno = id;
                String fn = rs.getString("firstname");
                String ln = rs.getString("lastname");
                String em = rs.getString("email");
                System.out.println(slno + " - "+fn+ " - "+ln+ " - "+em);

            }
            else{
                System.out.println("No student exists with the id "+id);
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
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                stmt.close();
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
