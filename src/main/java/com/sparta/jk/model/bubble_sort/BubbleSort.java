package com.sparta.jk.model.bubble_sort;

import com.sparta.jk.model.Sortable;

import java.util.Map;
import java.util.logging.Logger;

public class BubbleSort implements Sortable {
    private static final Logger logger = Logger.getLogger("sort-logger");
    public static int[] bubbleSort(int[] array){
        int len = array.length; //Length of array
        boolean swap; //Boolean for check if the array has been swapped
        //Loop for indication from back of array
        for (int i = 0; i < len - 1; i++){
            swap = false; //So the statement can check if it needs to stop looping
            //Loop to run through values in array up to the last value that was not sorted
            for (int j = 0; j < (len - i) - 1; j++){
                swap = isSwap(array, swap, j); //swap values and return swap is true to show array is not sorted
            }
            if (swap == false){break;} //Stops running if the no swaps occur meaning array is sorted
        }
        return array;
    }
    private static boolean isSwap(int[] array, boolean swap, int j) {
        //swap values next to each other if the first value is smaller
        if (array[j] > array[j + 1]){
            int temp = array[j];
            array[j] = array[j + 1];
            array[j + 1] = temp;
            swap = true;
        }
        return swap;
    }

    @Override
    public int[] sortArray(int[] unsortedArray) {
        int[] tempArray = unsortedArray.clone();
        bubbleSort(tempArray);
        return tempArray;
    }
}
