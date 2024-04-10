import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
    public static void main(String[] args) {
        try {
            Connection conn = getConnection();
            conn.close(); // Close the connection once done
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/DatabaseName";
        String user = "userid";
        String password = "password";
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println("Successfully Connected");
        return conn;
    }
}
