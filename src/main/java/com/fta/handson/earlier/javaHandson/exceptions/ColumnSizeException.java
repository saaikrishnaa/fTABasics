package com.fta.handson.earlier.javaHandson.exceptions;

public class ColumnSizeException extends RuntimeException{

    public ColumnSizeException(String exceptionText){
        super(exceptionText);
    }

    public ColumnSizeException(String message, Throwable text){
        super(message,text);
    }
}
