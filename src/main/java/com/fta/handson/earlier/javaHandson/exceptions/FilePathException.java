package com.fta.handson.earlier.javaHandson.exceptions;

public class FilePathException extends RuntimeException{

    public FilePathException(String message){
        super(message);
    }

    public FilePathException(String message, Throwable throwable){
        super(message, throwable);
    }
}
