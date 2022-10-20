package com.sparta.jk.controller;

import com.sparta.jk.model.ArrayGenerator;
import com.sparta.jk.view.DesignManager;
import com.sparta.jk.view.ScannerAlgorithmManager;

import java.util.Arrays;

public class SortManager {

    public static final int CLOSE_NUMBER = 5;
    public static void start(){
        int algorithmOfChoice = 0;
        int chosenArrayLen = 0;
        int[] genArray;
        try{
            while (algorithmOfChoice!=CLOSE_NUMBER){
                algorithmOfChoice = ScannerAlgorithmManager.scannerChooseAlgorithm();
                chosenArrayLen = ScannerAlgorithmManager.scannerChooseArrayLen();
                genArray = ArrayGenerator.getRandomArray(chosenArrayLen);
                if (algorithmOfChoice==4){
                    break;
                }else{
                    OutputResultsManager outputResultsManager =
                            OutputResultsManager.sortingAlgorithm(algorithmOfChoice,genArray);
                    DesignManager.printResults(outputResultsManager);
                }
            }
        } catch (Exception e) {
            System.out.println("lol");
        }
    }
}
