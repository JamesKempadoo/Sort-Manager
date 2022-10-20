package com.sparta.jk.exceptions;

public class IntMismatchException extends Exception{

    private final int num;

    public IntMismatchException(int num){
        this.num = num;
    }
    @Override
    public String getMessage() {
        return "Not an Integer. Please Input a number between 1 and " + num + ": ";
    }
}
