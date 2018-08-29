package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class VanillaMovieManager {
    private Connection connection = null;

    // Database properties
    private String url = "jdbc:mysql://localhost:3307/JH";
    private String driverClass = "com.mysql.jdbc.Driver";
    private String username = "mkonda";
    private String password = "mypass";

    private Connection getConnection() {
        try {
            Class.forName(driverClass).newInstance();
            connection = DriverManager.getConnection(url, username, password);
        } catch (Exception ex) {
            System.err.println("Exception:"+ ex.getMessage());
        }
        return connection;
    }

}
