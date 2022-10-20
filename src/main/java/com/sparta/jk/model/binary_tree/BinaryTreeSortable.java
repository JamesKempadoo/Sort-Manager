package com.sparta.jk.model.binary_tree;

import com.sparta.jk.exceptions.ChildNotFoundException;

public interface BinaryTreeSortable {
    int getRootElement();

    int getNumberOfElements();

    void addElement (int element);

    void addElements (final int[] elements);

    boolean findElement (int value);

    Node getRootNode();

    int getLeftChild (int element) throws ChildNotFoundException;


    int getRightChild (int element) throws ChildNotFoundException;

    int[] getSortedTreeAsc();

    int[] getSortedTreeDesc();

}
