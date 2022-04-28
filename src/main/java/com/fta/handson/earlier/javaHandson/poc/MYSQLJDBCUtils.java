package com.fta.handson.earlier.javaHandson.poc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Base64;
import java.util.Properties;

public class MYSQLJDBCUtils {

//    private static String jdbcURL = "jdbc:mysql://127.0.0.1:3306/practice";
//    private static String jdbcUsername = "root";
//    private static String jdbcPassword = "";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Properties properties = MYSQLJDBCUtils.readFromPropertiesFile("application.properties");
            String jdbcUrlFromPropertiesFile = properties.getProperty("jdbc-url");
            String jdbcUsernameFromPropertiesFile = properties.getProperty("jdbc-username");
            String passwordFromPropertiesFile = properties.getProperty("jdbc-password");
            String jdbcPasswordFromPropertiesFile = new String(Base64.getDecoder().decode(passwordFromPropertiesFile.getBytes()));
            String apiversion = properties.getProperty("apiversion");
            String list = properties.getProperty("list");
            String[] split = list.split(",");



            connection = DriverManager.getConnection(jdbcUrlFromPropertiesFile, jdbcUsernameFromPropertiesFile, jdbcPasswordFromPropertiesFile);

            if (connection != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
//        } finally {
//            try {
//                connection.close();
//            } catch (SQLException throwables) {
//                throwables.printStackTrace();
//            }
//        }
        return connection;
    }

    public static Properties readFromPropertiesFile(String fileName) {
//        FileInputStream fileInputStream = null;
        Properties properties = null;

        try(FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir").concat("/src/main/resources/").concat(fileName));) {
            properties = new Properties();
            properties.load(fileInputStream);
            return properties;
        } catch (IOException e) {
            e.printStackTrace();
        }
//        } catch (IOException e) {
//            e.printStackTrace();
////        } finally {
//            try {
//                fileInputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        return null;
    }

//    public static Connection getConnection() {
//        try (Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword)) {
//            if (connection != null) {
//                System.out.println("Connected to the database!");
//            } else {
//                System.out.println("Failed to make connection!");
//            }
//            return connection;
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    public static void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
