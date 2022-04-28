package com.fta.handson.java.exceptions;

import java.io.*;
import java.security.InvalidKeyException;
import java.sql.SQLException;

public class CheckedExceptionsWithThrows {

    public static void main(String[] args) {
        try {
            method1();
            FileInputStream fileInputStream = new FileInputStream(new File(System.getProperty("user.dir") + "testng.xml"));
            throw new SQLException();
        } catch(IOException | InvalidKeyException | SQLException exception){
            exception.getStackTrace();
        }
    }

    private static void method1() throws InvalidKeyException, FileNotFoundException {
//        System.out.println("Method1");

        //As the number of lines of executing this method is more, and there is a specific block of code that I can still reuse across,
        //I am creating a reusable method again
        method2();
    }

    private static void method2() throws InvalidKeyException, FileNotFoundException {
//        FileInputStream fileInputStream = new FileInputStream(new File(System.getProperty("user.dir") + "testdsng.xml"));
//        fileInputStream.close();

        //intentionally throwing another Exception
        // i am doing my business specific logic
//        throw new InvalidKeyException();

        //calling another method
        method3();
    }

    private static void method3() {

        method4();
        //can i throw a Run Time Exception?
//        throw new RuntimeException();

    }

    private static void method4() {
        try {
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("@#$@#$-invalid-path-@$@#$"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
//            throw new RuntimeException("Invalid File Path, Cannot proceed further");
            throw new InvalidFilePathException("Invalid File Path, Cannot proceed further", e.getCause());
//            throw new ColumnSizeException("Column name email address size mismatch");
        }
    }
}
