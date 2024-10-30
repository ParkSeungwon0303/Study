package study.quiz4;

import java.sql.*;

public class DBManager {
    protected static Connection dbConn;

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        String driver = "org.mariadb.jdbc.Driver";
        String DB_IP = "localhost";
        String DB_PORT = "3307";
        String DB_NAME = "testdb";
        String DB_URL = "jdbc:mariadb://" + DB_IP + ":" + DB_PORT + "/" + DB_NAME;
        Class.forName(driver);
        dbConn = DriverManager.getConnection(DB_URL, "root", "tkwls3159");
        return dbConn;
    }

    public static void insert(String name, int korScore, int engScore, int mathScore, int totalScore, double avgScore) {
        try {
            getConnection();
            PreparedStatement std = dbConn.prepareStatement("insert into user values(?, ?, ?, ?, ?, ?)");
            std.setString(1, name);
            std.setInt(2, korScore);
            std.setInt(3, engScore);
            std.setInt(4, mathScore);
            std.setInt(5, totalScore);
            std.setDouble(6, avgScore);
            int rs = std.executeUpdate();
            close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public static void select() {
        try {
            getConnection();
            PreparedStatement std = dbConn.prepareStatement("select * from user");
            ResultSet rs = std.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                int total = rs.getInt("total");
                double avg = rs.getDouble("avg");

                System.out.println(name + " 학생의 총점은 " + total + "평균은 " + avg);
                close();
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

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