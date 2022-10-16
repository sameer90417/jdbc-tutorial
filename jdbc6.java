import java.sql.*;

public class jdbc6 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        // Register the driver class
        Class.forName("com.mysql.cj.jdbc.Driver");

        // create connection
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String username = "root";
        String password = "Sam@1123";

        Connection con = DriverManager.getConnection(url, username, password);

        // create prepared statement
        String q = "select * from student";
        PreparedStatement pstmt = con.prepareStatement(q);

        ResultSet set = pstmt.executeQuery();
        ResultSetMetaData data = set.getMetaData();

        System.out.println("Column Count : "+data.getColumnCount());
        System.out.println("Column Name : "+data.getColumnName(1));
        System.out.println("Column Name : "+data.getColumnName(2));
        System.out.println("Column 1 Type Name : "+data.getColumnTypeName(1));
        System.out.println("Column 2 Type Name : "+data.getColumnTypeName(2));
    }

}
