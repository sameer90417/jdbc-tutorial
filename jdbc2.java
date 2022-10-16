import java.sql.*;
import java.util.Scanner;

public class jdbc2 {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);

        try {
            // Register the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            // create connection
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String username = "root";
            String password = "Tt25032001ss@";

            Connection con =  DriverManager.getConnection(url, username, password);


            // create prepared Statement
            String q = "insert into Student(id, name) values(? , ?)";
            PreparedStatement pstmt = con.prepareStatement(q);

            System.out.println("Enter Your name : ");
            String name = sc.nextLine();
            
            System.out.println("Enter id : ");
            int id = sc.nextInt();


            pstmt.setInt(1, id);
            pstmt.setString(2, name);

            pstmt.executeUpdate();

            con.close();

            



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
