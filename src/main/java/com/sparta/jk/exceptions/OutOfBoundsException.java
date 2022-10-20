package com.sparta.jk.exceptions;

public class OutOfBoundsException extends Exception{
    private final int num;

    public OutOfBoundsException(int num){
        this.num = num;
    }
    @Override
    public String getMessage() {
        return "Input was out of bounds please choose between 1 and " + num + ":";
    }
}
