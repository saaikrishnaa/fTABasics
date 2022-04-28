package com.fta.handson.earlier.javaHandson.exceptions;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class ExceptionsInStaticBlock {

    static {
        System.out.println("I am static initializer, I will be available even before object creation");
        System.out.println("I can even replace your Constants file, you can have all the constants placed in this block, " +
                "and I will make sure they are there available even before the object is created");

        try {
            Map<String, String> constantsMap = new HashMap<>();
            constantsMap.put("applicationUrl", "https://orangehrmlive.com");
            constantsMap.put("applicationEnvironment", "dev");
            constantsMap.put("databaseConnectionUrl", "mysql db url");

            for (Map.Entry<String, String> entry : constantsMap.entrySet()) {
                System.out.println("Key - " + entry.getKey() + " -> " + "Value - " + entry.getValue());
            }
            
            throw new FileNotFoundException("Some File Not Found Exception");

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}
