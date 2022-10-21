package com.sparta.jk.model;

import com.sparta.jk.model.merge_sort.MergeSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MergeSortTest {

    @Test
    @DisplayName("Check if array is changed if already in order")
    void checkIfArrayIsChangedIfAlreadyInOrder(){
        int[] testArray = {1,2,3};
        Assertions.assertEquals(Arrays.toString(testArray),Arrays.toString(MergeSort.mergeSort(testArray)));
    }

    @Test
    @DisplayName("Check that array is sorted.")
    void checkIfValuesInArraySwap(){
        int[] testArray = {3,2,1};
        int[] outcomeArray = {1,2,3};
        Assertions.assertEquals(Arrays.toString(outcomeArray),Arrays.toString(MergeSort.mergeSort(testArray)));
    }

    @Test
    @DisplayName("Check If Empty List Return empty list")
    void checkIfEmptyListReturnsEmptyList(){
        int[] emptyList = {};
        Assertions.assertEquals(Arrays.toString(emptyList),Arrays.toString(MergeSort.mergeSort(emptyList)));
    }

    @Test
    @DisplayName("Check If array of size 10 returns in order")
    void checkIfArrayOfSize10ReturnsInOrder(){
        int[] largeArray = {8,9,7,6,4,3,1,2,5,4,};
        int[] correct = {1, 2, 3, 4, 4, 5, 6, 7, 8, 9};
        Assertions.assertEquals(Arrays.toString(correct),Arrays.toString(MergeSort.mergeSort(largeArray)));
    }

    @Test
    @DisplayName("Check if array with one type of number returns same array")
    void checkIfArrayWithOneTypeOfNumberReturnsSameArray(){
        int[] digits = {7,7,7,7,7,7,7};
        Assertions.assertEquals(Arrays.toString(digits),Arrays.toString(MergeSort.mergeSort(digits)));
    }

    @Test
    @DisplayName("Check if minus number returns String")
    void checkIfMinusNumberReturnsString(){
        int[] minusArray = {-1,-2,-3,-4};
        int[] minusArraySorted = {-4,-3,-2,-1};
        Assertions.assertEquals(Arrays.toString(minusArraySorted),Arrays.toString(MergeSort.mergeSort(minusArray)));
    }

    @Test
    @DisplayName("Check if negative and positive numbers returns sorted array")
    void checkIfNegativeAndPositiveNumbersReturnsSortedArray(){
        int[] testArray = {-4,3,-9,6,-10,-6,10};
        int[] testArraySorted = {-10,-9,-6,-4,3,6,10};
        Assertions.assertEquals(Arrays.toString(testArraySorted),Arrays.toString(MergeSort.mergeSort(testArray)));
    }
}
