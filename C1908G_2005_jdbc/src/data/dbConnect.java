package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnect {
    private static final String USERNAME="root";
    private static final String PASSWORD ="";
    private static final String CONN_STRING ="jdbc:mysql://localhost/module?serverTimezone=UTC";
    private static final String CONN_STRING2 ="jdbc:mysql://localhost/module?serverTimezone=UTC";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
    }
    public  static Connection getConnection2() throws  SQLException{
        return DriverManager.getConnection(CONN_STRING2,USERNAME,PASSWORD);
    }
}
