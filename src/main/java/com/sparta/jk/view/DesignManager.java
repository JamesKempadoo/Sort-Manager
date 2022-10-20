package com.sparta.jk.view;

import com.sparta.jk.controller.OutputResultsManager;
import com.sparta.jk.controller.SortManager;

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
                |  Sort Algorithm:\s""" + outputResultsManager.getAlgorithmName() +"\n"
             + "|  Original Array:\s" + (Arrays.toString(outputResultsManager.getUnsortedArray())) +"\n"
             + "|------------------------------------------------------------" +"\n"
             + "|  Sorted Array:\s" + (Arrays.toString(outputResultsManager.getSortedArray())) +"\n"
             + "|------------------------------------------------------------" +"\n"
             + "|  Time Take To Run:\s" + outputResultsManager.getTimeTaken() +" milliseconds\n"
                );
    }


    public static void printString(String string){
        System.out.println(string);
    }
}
