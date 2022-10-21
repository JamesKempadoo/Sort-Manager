package com.sparta.jk.model;

import com.sparta.jk.exceptions.ChildNotFoundException;
import com.sparta.jk.model.binary_tree.BinarySort;
import com.sparta.jk.model.binary_tree.BinarySortManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.Arrays;

public class BinaryTreeTest {

    @Test
    @DisplayName("Check ")
    void checkRootElement(){
        int[] array = {7,5,6,8,1,3};
        BinarySort tree = new BinarySort(array[0]);
        Assertions.assertEquals(7,tree.getRootElement());
    }
    @Test
    @DisplayName("Check ")
    void checkRootLeftChild() throws ChildNotFoundException {
        int[] array = {7,5,6,8,1,3};
        BinarySort tree = new BinarySort(array[0]);
        tree.addElements(array);
        Assertions.assertEquals(5,tree.getLeftChild(tree.getRootElement()));
    }

    @Test
    @DisplayName("Check ")
    void checkRootRightChild() throws ChildNotFoundException {
        int[] array = {7,5,6,8,1,3};
        BinarySort tree = new BinarySort(array[0]);
        tree.addElements(array);
        Assertions.assertEquals(8,tree.getRightChild(tree.getRootElement()));
    }
    @Test
    @DisplayName("Check ")
    void checkAddElementHigher() throws ChildNotFoundException {
        int[] array = {7,5,6,8,1,3};
        BinarySort tree = new BinarySort(array[0]);
        tree.addElements(array);
        tree.addElement(9);
        Assertions.assertEquals(9,tree.getRightChild(8));
    }

    @Test
    @DisplayName("Check ")
    void checkAddElementLower() throws ChildNotFoundException {
        int[] array = {7,5,6,8,1,3};
        BinarySort tree = new BinarySort(array[0]);
        tree.addElements(array);
        tree.addElement(9);
        Assertions.assertEquals(9,tree.getRightChild(8));
    }

    @Test
    @DisplayName("Check ")
    void checkAddElementSameNumber() throws ChildNotFoundException {
        int[] array = {7,5,6,8,1,3};
        BinarySort tree = new BinarySort(array[0]);
        tree.addElements(array);
        tree.addElement(7);
        Assertions.assertEquals(7,tree.getLeftChild(8));
    }

    @Test
    @DisplayName("Check ")
    void checkSortAscList() {
        int[] array = {7,5,6,8,1,3};
        int[] outputArray = {1,3,5,6,7,8};
        BinarySort tree = new BinarySort(array[0]);
        tree.addElements(array);
        Assertions.assertEquals(Arrays.toString(outputArray),Arrays.toString(tree.getSortedTreeAsc()));
    }

    @Test
    @DisplayName("Check ")
    void checkSortDescList() {
        int[] array = {7,5,6,8,1,3};
        int[] outputArray = {8,7,6,5,3,1};
        BinarySort tree = new BinarySort(array[0]);
        tree.addElements(array);
        Assertions.assertEquals(Arrays.toString(outputArray),Arrays.toString(tree.getSortedTreeDesc()));
    }


}
