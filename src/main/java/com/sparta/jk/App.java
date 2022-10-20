package com.sparta.jk;

import com.sparta.jk.exceptions.ChildNotFoundException;
import com.sparta.jk.mvc.model.merge_sort.MergeSort;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        int[] testArray = {1,6,4,5,8,9,4,5,3,1,2,5,46,8,4};
        System.out.println(Arrays.toString(MergeSort.mergeSort(testArray)));

    }
}
