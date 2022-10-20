package com.sparta.jk.controller;

import com.sparta.jk.model.Sortable;
import com.sparta.jk.model.binary_tree.BinarySortManager;
import com.sparta.jk.model.bubble_sort.BubbleSort;
import com.sparta.jk.model.merge_sort.MergeSort;

public class SortFactory {
    public static String getAlgorithmNames(int algorithmOfChoice){
        return switch (algorithmOfChoice){
            case 1 -> "Bubble Sort";
            case 2 -> "Merge Sort";
            default -> "Binary Sort Manager";

        };
    }
    public static Sortable getAlgorithm(int algorithmOfChoice){
        return switch (algorithmOfChoice){
            case 1 -> new BubbleSort();
            case 2 -> new MergeSort();
            default -> new BinarySortManager();
        };
    }


}
