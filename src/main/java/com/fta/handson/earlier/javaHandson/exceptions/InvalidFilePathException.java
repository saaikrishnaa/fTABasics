package com.fta.handson.earlier.javaHandson.exceptions;

public class InvalidFilePathException extends FilePathException{

    public InvalidFilePathException(String message){
        super(message);
    }

    public InvalidFilePathException(String message, Throwable throwable){
        super(message, throwable);
    }
}
