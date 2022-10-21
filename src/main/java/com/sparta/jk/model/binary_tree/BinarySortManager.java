package com.sparta.jk.model.binary_tree;

import com.sparta.jk.controller.OutputResultsManager;
import com.sparta.jk.model.Sortable;

public class BinarySortManager implements Sortable {

    public BinarySortManager(){
        double start= 0;
    }


    @Override
    public int[] sortArray(int[] unsortedArray) {
        BinarySort binaryTreeSortable = new BinarySort(unsortedArray);
        double start = System.nanoTime();
        return binaryTreeSortable.getSortedTreeAsc();
    }
}

