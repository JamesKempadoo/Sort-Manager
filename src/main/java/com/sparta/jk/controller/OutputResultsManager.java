package com.sparta.jk.controller;

import com.sparta.jk.model.Sortable;

import java.util.ArrayList;

import static com.sparta.jk.controller.SortManager.ALGORITHMS_IMPLEMENTED;

public record OutputResultsManager(String algorithmName, int[] sortedArray, int[] unsortedArray, double timeTaken) {

    public static OutputResultsManager sortingAlgorithm(int algorithmOfChoice, int[] unsortedArray) {
        Sortable algorithm = SortFactory.getAlgorithm(algorithmOfChoice);
        String algorithmName = SortFactory.getAlgorithmNames(algorithmOfChoice);
        double startTime = System.nanoTime();
        int[] sortedArray = algorithm.sortArray(unsortedArray);
        double endTime = System.nanoTime();
        double sortTime = (endTime - startTime);
        return new OutputResultsManager(algorithmName, sortedArray, unsortedArray, sortTime);
    }

    public static ArrayList<OutputResultsManager> allSortingAlgorithms(int[] unsortedArray) {
        ArrayList<OutputResultsManager> listOfResults = new ArrayList<>();
        for (int i = 0; i < ALGORITHMS_IMPLEMENTED; i++) {
            listOfResults.add(sortingAlgorithm(i, unsortedArray));
        }
        return listOfResults;
    }

    ;;


}
