package com.fta.handson.java.poc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.github.javafaker.*;

public class CreateRecord {

    private static final String INSERT_USERS_SQL = "INSERT INTO users" +
            "  (id, name, email, country, password) VALUES " +
            " (?, ?, ?, ?, ?);";

    public static void main(String[] argv) throws SQLException {
        CreateRecord createTableExample = new CreateRecord();
        createTableExample.insertRecord(); // with try with resources
//        createTableExample.insertRecordWithTraditionalTryCatchFinallyBlocks(); //with traditional try catch finally blocks
    }

    public void insertRecordWithTraditionalTryCatchFinallyBlocks() throws SQLException {
        System.out.println(INSERT_USERS_SQL);
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            // Step 1: Establishing a Connection
            connection = MYSQLJDBCUtils.getConnection();
            // Step 2:Create a statement using connection object
            preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);

            ReadRecord readRecord = new ReadRecord();
            int currentRecordId = readRecord.readExistingRecord();
            preparedStatement.setInt(1, currentRecordId+1);
            preparedStatement.setString(2, "Tony");
            preparedStatement.setString(3, "tony@gmail.com");
            preparedStatement.setString(4, "US");
            preparedStatement.setString(5, "secret");

            System.out.println(preparedStatement);

            // Step 3: Execute the query or update query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            // print SQL exception information
            MYSQLJDBCUtils.printSQLException(e);
        } finally{
            preparedStatement.close();
            connection.close();
        }
    }

    public void insertRecord() throws SQLException {

        Faker faker = new Faker();
        System.out.println(INSERT_USERS_SQL);
        // Step 1: Establishing a Connection
        try (Connection connection = MYSQLJDBCUtils.getConnection();
             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            ReadRecord readRecord = new ReadRecord();
            int currentRecordId = readRecord.readExistingRecord();
            preparedStatement.setInt(1, currentRecordId+1);
            preparedStatement.setString(2, faker.name().firstName().concat(faker.name().lastName()));
            preparedStatement.setString(3, faker.internet().emailAddress());
            preparedStatement.setString(4, faker.country().name());
            preparedStatement.setString(5, faker.internet().password());

            System.out.println(preparedStatement);

            // Step 3: Execute the query or update query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {

            // print SQL exception information
            MYSQLJDBCUtils.printSQLException(e);
        }

        // Step 4: try-with-resource statement will auto close the connection.
    }
}
