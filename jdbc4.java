import java.sql.*;

public class jdbc4 {
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
            String q = "select * from student";
            PreparedStatement pstmt = con.prepareStatement(q);

            ResultSet set = pstmt.executeQuery();

            while (set.next()) {
                System.out.print(set.getInt(1)+"  ");
                System.out.println(set.getString(2));
            }
            
            

            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
