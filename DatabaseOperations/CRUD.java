import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUD {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/TestDatabase";
        String user = "userid";
        String password = "password";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Successfully Connected");
            Statement stmt = conn.createStatement();

            int rows = stmt.executeUpdate("INSERT INTO employee(age, name) VALUES(23, 'James')");
            System.out.println("Rows inserted: " + rows);

            rows = stmt.executeUpdate("UPDATE employee SET age=31 WHERE name='James'");
            System.out.println("Rows updated: " + rows);

            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");
            while (rs.next()) {
                System.out.println("Emp Id: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Age: " + rs.getInt("age"));
            }

            rows = stmt.executeUpdate("DELETE FROM employee WHERE name='James'");
            System.out.println("Rows deleted: " + rows);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
