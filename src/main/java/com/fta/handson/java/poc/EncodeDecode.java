package com.fta.handson.java.poc;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class EncodeDecode {

    public static void main(String[] args) {
        String encodedString = Base64.getEncoder().encodeToString("pwd".getBytes(StandardCharsets.UTF_8));
        System.out.println("encodedString = " + encodedString);

        String decodedString = new String(Base64.getDecoder().decode("a3JJU2huQTE5KiQ=".getBytes(StandardCharsets.UTF_8)));
        System.out.println("decodedString = " + decodedString);

    }
}
