import java.sql.*;

public class jdbc7 {

    public static void main(String[] args) {
        
        try {

        // Register the driver class
        Class.forName("com.mysql.cj.jdbc.Driver");

        // create connection
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String username = "root";
        String password = "Sam@1123";

        Connection con = DriverManager.getConnection(url, username, password);

        DatabaseMetaData dm = con.getMetaData();

        System.out.println("Database Product Name : "+dm.getDatabaseProductName());
        System.out.println("Database version : "+dm.getDriverVersion());
        System.out.println("Database Driver name : "+dm.getDriverName());
        System.out.println("Driver version : "+dm.getDriverVersion());


            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
