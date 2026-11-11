
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MyConnection {

    public static final String username = System.getenv("DB_USERNAME");
    public static final String password = System.getenv("DB_PASSWORD");
    public static final String url =
            "jdbc:mysql://localhost:3306/online_shopping";

    public static Connection con = null;

    public static Connection getConnection() throws SQLException {
        try {
            if (username == null || password == null) {
                throw new SQLException("Database credentials are not configured.");
            }

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    null, "" + ex, "", JOptionPane.WARNING_MESSAGE);
        }

        return con;
    }
}
