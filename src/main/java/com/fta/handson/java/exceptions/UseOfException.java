package com.fta.handson.java.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class UseOfException {

    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/some-unavailable-file.txt");
        }catch(FileNotFoundException exception){
            System.out.println("Exeception occured, and i am handling, and my sub sequent logic will execute, as I handled the exception");
        }

        System.out.println("My next line in the code execution");
    }
}
