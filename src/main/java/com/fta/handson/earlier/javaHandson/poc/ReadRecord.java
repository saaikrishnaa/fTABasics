package com.fta.handson.earlier.javaHandson.poc;

import java.sql.*;

public class ReadRecord {

    private static final String QUERY = "select id,name,email,country,password from users ORDER BY id DESC LIMIT 1";

    public static void main(String[] args) {
        ReadRecord readRecord = new ReadRecord();
        readRecord.readExistingRecord();
    }

    public int readExistingRecord() {
        try (
                Connection connection = MYSQLJDBCUtils.getConnection();
                Statement statement = connection.createStatement();
        ) {
            // Step 3: Execute the query or update query
//            ResultSet rs = preparedStatement.executeQuery();
            ResultSet rs = statement.executeQuery(QUERY);
            // Step 4: Process the ResultSet object.
            int id = 0;
            if (rs.next()) {
                id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                String password = rs.getString("password");
                System.out.println(id + "," + name + "," + email + "," + country + "," + password);
//                rs.next();
            }
            return id;
        } catch (SQLException e) {
            MYSQLJDBCUtils.printSQLException(e);
        }
        // Step 4: try-with-resource statement will auto close the connection.
        return 0;
    }
}
