package com.sparta.jk.model.binary_tree;

public class Node {
    private final int value;
    private Node leftChild; //Can be set to null, but do not want to use them
    private Node rightChild;

    public Node(int value) {
        this.value = value;
    }

    public Node getLeftChild() {
        return leftChild = leftChild; //return left child
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild; //set right child
    }

    public Node getRightChild() {
        return rightChild; //return right child
    }

    public void setRightChildNode(Node rightChild) {
        this.rightChild = rightChild; //set right child
    }

    public int getValue() {
        return value; //return value
    }

    public boolean isLeftChildEmpty() {
        return leftChild == null; //check if left child is null
    }

    public boolean isRightChildEmpty() {
        return rightChild == null; //check if right child is null
    }
}
