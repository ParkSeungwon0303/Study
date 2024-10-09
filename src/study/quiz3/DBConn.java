package study.quiz3;

import java.sql.*;

public class DBConn {
    protected static Connection dbConn;

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        if (dbConn == null) {
            String driver = "org.mariadb.jdbc.Driver";
            String DB_IP = "localhost";
            String DB_PORT = "3307";
            String DB_NAME = "testdb";
            String DB_URL = "jdbc:mariadb://" + DB_IP + ":" + DB_PORT + "/" + DB_NAME;
            Class.forName(driver);
            dbConn = DriverManager.getConnection(DB_URL, "root", "tkwls3159");
        }
        return dbConn;
    }

    public static Connection getConnection(String url, String user, String pwd) throws ClassNotFoundException, SQLException {
        if (dbConn == null) {
            Class.forName("org.mariadb.jdbc.Driver");
            dbConn = DriverManager.getConnection(url, user, pwd);
        }
        return dbConn;
    }

    public static void close() throws SQLException {
        if (dbConn != null) {
            if (!dbConn.isClosed()) {
                dbConn.close();
            }
        }

        dbConn = null;
    }



}