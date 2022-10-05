package jm.task.core.jdbc.util;

import org.hibernate.SessionFactory;

import java.sql.*;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "rood";

    private static final Connection connection = Conn();
    private static Connection Conn() {
        try {
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}
































/**
 *     public static void main(String[] args) {
 *         try {
 *             Driver driver = new com.mysql.cj.jdbc.Driver();
 *             DriverManager.registerDriver(driver);
 *         } catch (SQLException e) {
 *             System.out.println("getConnectionException");
 *         }
 *
 *         try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD); Statement statement = connection.createStatement()) {
 *             statement.executeUpdate("update users set name = 'Mikkey' where id = 5");
 *         } catch (SQLException e) {
 *             System.out.println("ты по-моему перепутал");
 *         }
 *     }
 */
