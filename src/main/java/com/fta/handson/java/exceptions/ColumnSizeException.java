package com.fta.handson.java.exceptions;

public class ColumnSizeException extends RuntimeException{

    public ColumnSizeException(String exceptionText){
        super(exceptionText);
    }

    public ColumnSizeException(String message, Throwable text){
        super(message,text);
    }
}
