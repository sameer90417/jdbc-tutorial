import java.io.FileInputStream;
import java.sql.*;

public class jdbc3 {

    public static void main(String[] args) {

        try {

            // Register the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            // create connection
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String username = "root";
            String password = "Tt25032001ss@";

            Connection con = DriverManager.getConnection(url, username, password);

            // create prepared statement
            String q = "insert into person(name, image) values(?,?)";
            PreparedStatement pstmt = con.prepareStatement(q);

            pstmt.setString(1, "Vikas");

            FileInputStream fis = new FileInputStream("2.png");
            pstmt.setBinaryStream(2, fis, fis.available());

            pstmt.executeUpdate();

            con.close();




        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
