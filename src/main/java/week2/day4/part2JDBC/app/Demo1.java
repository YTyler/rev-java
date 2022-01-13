package week2.day4.part2JDBC.app;

import java.sql.*;

public class Demo1 {
    public static void main(String[] args) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/RevJan2022";
        String username = "root";
        String password = "root";

        Connection conn = null ;
        Statement stmt = null ;
        ResultSet rs = null ;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM student";
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                int slno = rs.getInt(1);
                String fn = rs.getString("firstname");
                String ln = rs.getString("lastname");
                String em = rs.getString("email");
                System.out.println(slno + " - "+fn+ " - "+ln+ " - "+em);

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
