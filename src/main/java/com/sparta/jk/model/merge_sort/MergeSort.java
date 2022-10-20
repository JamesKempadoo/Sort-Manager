package com.sparta.jk.model.merge_sort;

import com.sparta.jk.model.Sortable;

public class MergeSort implements Sortable {
    public static int[] mergeSort(int[] array) {
        int len = array.length;
        if (len < 2) {
            return array;
        }
        int midpoint = len / 2;
        int[] left = new int[midpoint];
        int[] right = new int[len - midpoint];

        for (int i = 0; i < midpoint; i++) {
            left[i] = array[i];
        }
        for (int i = midpoint; i < len; i++) {
            right[i - midpoint] = array[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left, right, array);
        return array;
    }

    public static void merge(int[] left, int[] right, int[] array) {
        int i = 0, j = 0, k = 0, lenL = left.length, lenR = right.length;
        while (i < lenL && j < lenR) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }
        while (i < lenL) {
            array[k++] = left[i++];
        }
        while (j < lenR) {
            array[k++] = right[j++];
        }
    }

    @Override
    public int[] sortArray(int[] unsortedArray) {
        int[] tempArray = unsortedArray.clone();
        return mergeSort(tempArray);
    }
}
