package com.fta.handson.earlier.javaHandson.poc;

import org.aeonbits.owner.ConfigFactory;

public class EasyPropertyFileReader {

    public static void main(String[] args) {
        ReadProperties properties = ConfigFactory.create(ReadProperties.class);

        System.out.println(properties.username());
        System.out.println(properties.url());
        System.out.println(properties.password());
        System.out.println(properties.version());

        for(String technology : properties.technologies()) {
            System.out.println(technology);
        }
    }
}
