package com.sparta.jk.exceptions;

public class ChildNotFoundException extends Exception{

    @Override
    public String getMessage() {
        return "This node does not have a child";
    }


}
