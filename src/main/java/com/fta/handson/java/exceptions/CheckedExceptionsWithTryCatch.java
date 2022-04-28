package com.fta.handson.java.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionsWithTryCatch {

    public static void main(String[] args) {

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(new File(System.getProperty("user.dir")+"testng.xml"));
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
