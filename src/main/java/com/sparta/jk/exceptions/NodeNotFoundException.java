package com.sparta.jk.exceptions;

public class NodeNotFoundException extends Exception{
    @Override
    public String getMessage() {
        return "This element does not exist within Tree";
    }

}
