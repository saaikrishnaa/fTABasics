package com.fta.handson.earlier.javaHandson.poc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateRecord {

    private static final String UPDATE_USERS_SQL = "update users set name = ?, email = ?, country=?,  password = ? where id = ?;";

    public static void main(String[] argv) throws SQLException {
        UpdateRecord updateStatementExample = new UpdateRecord();
        updateStatementExample.updateRecord();
    }

    public void updateRecord() throws SQLException {
        System.out.println(UPDATE_USERS_SQL);
        // Step 1: Establishing a Connection
        try (Connection connection = MYSQLJDBCUtils.getConnection();
             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USERS_SQL)) {
            preparedStatement.setString(1, "Ram");
            preparedStatement.setString(2, "ram@gmail.com");
            preparedStatement.setString(3,"India");
            preparedStatement.setString(4,"mypwd");
            preparedStatement.setInt(5,3);

            // Step 3: Execute the query or update query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {

            // print SQL exception information
            MYSQLJDBCUtils.printSQLException(e);
        }

        // Step 4: try-with-resource statement will auto close the connection.
    }
}
