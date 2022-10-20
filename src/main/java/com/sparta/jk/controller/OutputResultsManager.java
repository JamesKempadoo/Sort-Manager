package com.sparta.jk.controller;

import com.sparta.jk.model.Sortable;

public class OutputResultsManager {
    private final String algorithmName;
    private final int[] sortedArray;
    private final int[] unsortedArray;
    private final double timeTaken;

    public OutputResultsManager(String algorithmName,int[] sortedArray,
                                int[] unsortedArray,  double timeTaken) {
        this.algorithmName = algorithmName;
        this.sortedArray = sortedArray;
        this.unsortedArray = unsortedArray;
        this.timeTaken = timeTaken;
    }

    public static OutputResultsManager sortingAlgorithm(int algorithmOfChoice, int[] unsortedArray){
        Sortable algorithm = SortFactory.getAlgorithm(algorithmOfChoice);
        String algorithmName = SortFactory.getAlgorithmNames(algorithmOfChoice);
        double startTime = System.nanoTime();
        int[] sortedArray = algorithm.sortArray(unsortedArray);
        double  endTime = System.nanoTime();
        double sortTime = (endTime - startTime);
        return new OutputResultsManager(algorithmName,sortedArray,unsortedArray,sortTime);

    }



    public String getAlgorithmName(){return algorithmName;}
    public int[] getUnsortedArray(){return unsortedArray;}
    public int[] getSortedArray(){return sortedArray;};
    public double getTimeTaken(){return timeTaken;};



}
