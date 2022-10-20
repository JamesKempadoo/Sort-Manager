package com.sparta.jk.model;

import java.util.Random;

import static com.sparta.jk.view.ScannerAlgorithmManager.MAX_ELEMENT;

public class ArrayGenerator {

    private static final Random randomInt = new Random();
    public static int[] getRandomArray(int size) {
        int [] randomArray = new int[size];
        for (int i = 0; i < randomArray.length; i++){
            randomArray[i] = randomInt.nextInt(MAX_ELEMENT);
        }
        return randomArray;
    }
}
