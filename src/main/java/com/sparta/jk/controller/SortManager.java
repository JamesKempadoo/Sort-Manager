package com.sparta.jk.controller;

import com.sparta.jk.model.ArrayGenerator;
import com.sparta.jk.view.DesignManager;
import com.sparta.jk.view.ScannerAlgorithmManager;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SortManager {
    private static final Logger logger = Logger.getLogger("sort-logger");
    public static final int CLOSE_NUMBER = 5;
    public static final int ALGORITHMS_IMPLEMENTED = 3;
    public static void start(){
        int algorithmOfChoice = 0;
        int chosenArrayLen = 0;
        int[] genArray;
        try {
            logger.log(Level.INFO, "Start Menu Loop");
            while (algorithmOfChoice != CLOSE_NUMBER) {

                algorithmOfChoice = ScannerAlgorithmManager.scannerChooseAlgorithm();
                logger.log(Level.INFO, "Algorithm number: " + algorithmOfChoice);
                if (algorithmOfChoice == CLOSE_NUMBER) {
                    break;
                }
                chosenArrayLen = ScannerAlgorithmManager.scannerChooseArrayLen();
                logger.log(Level.INFO, "Array Length: " + chosenArrayLen);
                genArray = ArrayGenerator.getRandomArray(chosenArrayLen);
                logger.log(Level.INFO, "Generated Array" + Arrays.toString(genArray));
                if (algorithmOfChoice == CLOSE_NUMBER - 1) {
                    logger.log(Level.INFO, "All Algorithm Sort Start");
                    ArrayList<OutputResultsManager> outputResultsManager =
                            OutputResultsManager.allSortingAlgorithms(genArray);
                    DesignManager.printComparison(outputResultsManager);
                    logger.log(Level.INFO, "All Algorithm Sort Stop");
                } else {
                    logger.log(Level.INFO, "Algorithm Sort Start");
                    OutputResultsManager outputResultsManager =
                            OutputResultsManager.sortingAlgorithm(algorithmOfChoice, genArray);
                    logger.log(Level.INFO, "Sorted Array" + Arrays.toString(outputResultsManager.sortedArray()));
                    DesignManager.printResults(outputResultsManager);
                    logger.log(Level.INFO, "Algorithm Sort Stop");
                }
            }
            logger.log(Level.INFO, "Exiting program");
            System.exit(1);
        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage());
        }
    }
}
