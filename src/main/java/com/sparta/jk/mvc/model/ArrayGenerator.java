package com.sparta.jk.mvc.model;

import java.util.Random;

public class ArrayGenerator {

    private final Random randomInt = new Random();

    public int[] randomArrayGenerator(int size) {
        int [] randomArray = new int[size];
        for (int i = 0; i < randomArray.length; i++){
            randomArray[i] = randomInt.nextInt(Integer.MAX_VALUE);
        }
        return randomArray;
    }
}
