import java.sql.*;

public class jdbc1 {
    public static void main(String[] args) {
        
        try {
            // Register the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            // create connection
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String username = "root";
            String password = "Tt25032001ss@";

            Connection con =  DriverManager.getConnection(url, username, password);

            // create statement
            String q = "create table Student(id int, name varchar(10))";
            Statement stmt = con.createStatement();

            // execute query
            stmt.executeUpdate(q);

            // close connection
            con.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}