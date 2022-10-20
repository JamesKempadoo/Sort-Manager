package com.sparta.jk.model.binary_tree;

import com.sparta.jk.model.Sortable;

public class BinarySortManager implements Sortable {
    @Override
    public int[] sortArray(int[] unsortedArray) {
        BinarySort binaryTreeSortable = new BinarySort(unsortedArray);


        return binaryTreeSortable.getSortedTreeAsc();
    }
}

