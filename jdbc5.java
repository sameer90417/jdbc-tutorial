import java.io.FileOutputStream;
import java.sql.*;

public class jdbc5 {
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
            String q = "select * from person";
            PreparedStatement pstmt = con.prepareStatement(q);

            ResultSet set = pstmt.executeQuery();

            set.next();
            Blob b =  set.getBlob(2);
            byte []brr = b.getBytes(1, (int)b.length());

            FileOutputStream fos = new FileOutputStream("Tarique.jpg");
            fos.write(brr);

            fos.close();

            con.close();



        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
