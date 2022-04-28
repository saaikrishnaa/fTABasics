package com.fta.handson.java.staticentity;

import java.util.HashMap;
import java.util.Map;

public class StaticBlock {

    static {
        System.out.println("I am static initializer, I will be available even before object creation");
        System.out.println("I can even replace your Constants file, you can have all the constants placed in this block, and I will make sure they are there available even before the object is created");

        Map<String, String> constantsMap = new HashMap<>();
        constantsMap.put("applicationUrl", "https://orangehrmlive.com");
        constantsMap.put("applicationEnvironment", "dev");
        constantsMap.put("databaseConnectionUrl", "mysql db url");

        for (Map.Entry<String, String> entry : constantsMap.entrySet()) {
            System.out.println("Key - " + entry.getKey() + " -> " + "Value - " + entry.getValue());
        }

        System.out.println("============================================================================");

    }

    public StaticBlock() {
        System.out.println("I am constructor");
    }

    public static void staticMethod() {
        System.out.println("I am static method, To execute me, you don't require the class's instance, rather use the classname.variable or classname.method syntax");
    }

    public void businessMethod() {
        System.out.println("To execute me, You need this class's instance/object");

    }

}
