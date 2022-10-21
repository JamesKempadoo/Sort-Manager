package com.sparta.jk.model;

import com.sparta.jk.model.bubble_sort.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class BubbleSortTest {

    @Test
    @DisplayName("Check if array is changed if already in order")
    void checkIfArrayIsChangedIfAlreadyInOrder(){
        int[] testArray = {1,2,3};
        Assertions.assertEquals(Arrays.toString(testArray),Arrays.toString(BubbleSort.bubbleSort(testArray)));
    }

    @Test
    @DisplayName("Check that array is sorted.")
    void checkIfValuesInArraySwap(){
        int[] testArray = {3,2,1};
        int[] outcomeArray = {1,2,3};
        Assertions.assertEquals(Arrays.toString(outcomeArray),Arrays.toString(BubbleSort.bubbleSort(testArray)));
    }

    @Test
    @DisplayName("Check If Empty List Return empty list")
    void checkIfEmptyListReturnsEmptyList(){
        int[] emptyList = {};
        Assertions.assertEquals(Arrays.toString(emptyList),Arrays.toString(BubbleSort.bubbleSort(emptyList)));
    }

    @Test
    @DisplayName("Check If array of size 10 returns in order")
    void checkIfArrayOfSize10ReturnsInOrder(){
        int[] largeArray = {8,9,7,6,4,3,1,2,5,4,};
        int[] correct = {1, 2, 3, 4, 4, 5, 6, 7, 8, 9};
        Assertions.assertEquals(Arrays.toString(correct),Arrays.toString(BubbleSort.bubbleSort(largeArray)));
    }

    @Test
    @DisplayName("Check if array with one type of number returns same array")
    void checkIfArrayWithOneTypeOfNumberReturnsSameArray(){
        int[] digits = {7,7,7,7,7,7,7};
        Assertions.assertEquals(Arrays.toString(digits),Arrays.toString(BubbleSort.bubbleSort(digits)));
    }

    @Test
    @DisplayName("Check if minus number returns String")
    void checkIfMinusNumberReturnsString(){
        int[] minusArray = {-1,-2,-3,-4};
        int[] minusArraySorted = {-4,-3,-2,-1};
        Assertions.assertEquals(Arrays.toString(minusArraySorted),Arrays.toString(BubbleSort.bubbleSort(minusArray)));
    }

    @Test
    @DisplayName("Check if negative and positive numbers returns sorted array")
    void checkIfNegativeAndPositiveNumbersReturnsSortedArray(){
        int[] testArray = {-4,3,-9,6,-10,-6,10};
        int[] testArraySorted = {-10,-9,-6,-4,3,6,10};
        Assertions.assertEquals(Arrays.toString(testArraySorted),Arrays.toString(BubbleSort.bubbleSort(testArray)));
    }









}
