package com.sparta.jk.view;

import com.sparta.jk.controller.OutputResultsManager;

import java.util.ArrayList;
import java.util.Arrays;

public class DesignManager {

    public static void printMenu(){
        System.out.print("""
                 |<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>
                 |  Sort Manager                                             
                 |  1 - Bubble Sort                                          
                 |  2 - Merge Sort                                           
                 |  3 - Binary Tree Sort                                     
                 |  4 - Compare Speeds                  
                 |  5 - Exit                                    
                 |  Select by inputting number corresponding to the option   
                 Your Choice:\s""");;
    }

    public static void printArrayLen(int arraySize, int elementSize) {
        System.out.println("""
                |<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>
                |  Please input a number for the array size                 
                |  Array Size must be smaller than\s""" + arraySize +"\n"
                + """
                |  Array Size must be larger than 1                         
                |  The elements will be between 0 an 10,000                 
                Your Choice:\s""");
    }

    public static void printResults(OutputResultsManager outputResultsManager){
        System.out.println("""
                |<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>
                |  Sort Algorithm:\s""" + outputResultsManager.algorithmName() +"\n"
             + "|  Original Array:\s" + (Arrays.toString(outputResultsManager.unsortedArray())) +"\n"
             + "|------------------------------------------------------------" +"\n"
             + "|  Sorted Array:\s" + (Arrays.toString(outputResultsManager.sortedArray())) +"\n"
             + "|------------------------------------------------------------" +"\n"
             + "|  Time Take To Run:\s" + outputResultsManager.timeTaken() +" nanoseconds\n"
                );
    }

    public static void printComparison(ArrayList<OutputResultsManager> listOfAlgorithms) {
        System.out.println("""
                |<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>"
                |  Running Algorithms""");
        for (OutputResultsManager outputResultsManager : listOfAlgorithms){
            printResults(outputResultsManager);
        }
        System.out.println("""
                        |<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>
                        |  Sort Algorithm : Time take (Nanoseconds)""");
        for (OutputResultsManager outputResultsManager : listOfAlgorithms){
            System.out.println("|  " + outputResultsManager.algorithmName()
                    +" : " + outputResultsManager.timeTaken());
        }
        System.out.println("");
    }


    public static void printString(String string){
        System.out.println(string);
    }


}
