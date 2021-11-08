package UtilClass;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
    private static Connection connection;

    public static Connection getConnect() {
        String url = "";
        String user = "user";
        String password = "password";
        if (connection == null) {
            try {
                Driver driver = new com.mysql.jdbc.Driver();
                DriverManager.registerDriver(driver);
                connection = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                System.out.println("Unable to load driver class.");
                e.printStackTrace();
            }

        }
        return connection;

    }
}

