package com.sparta.jk.model.binary_tree;

import com.sparta.jk.controller.OutputResultsManager;
import com.sparta.jk.exceptions.ChildNotFoundException;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BinarySort implements BinaryTreeSortable {
    private static final Logger logger = Logger.getLogger("sort-logger");
    class Node {
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

    private final Node rootNode;
    private int numOfNodes = 1;

    public BinarySort(int element) {  //can't have a tree without a root Node
        this.rootNode = new Node(element);
    }
    public BinarySort(int[] array) {  //can't have a tree without a root Node
        logger.log(Level.FINE, "Binary Sort Start");
        this.rootNode = new Node(array[0]);
        logger.log(Level.INFO, "Add elements to Tree");
        addElements(array);
    }
    //nest node class here
    //add node to the tree
    private void addNodeToTree(Node node, int element) {
        if (element < node.getValue()) { //I want to be the left child
            if (node.isLeftChildEmpty()) { //Is there room for me
                node.setLeftChild(new Node(element)); //I am the left Child
                numOfNodes++;
            } else {
                addNodeToTree(node.getLeftChild(), element);
            }
        } else if (element > node.getValue()) {
            if (node.isRightChildEmpty()) {
                node.setRightChildNode(new Node(element));
                numOfNodes++;
            } else {
                addNodeToTree(node.getRightChild(), element);
            }
        } else {numOfNodes++;}
    }

    @Override
    public boolean findElement(int element) {
        Node node = findNode(element);
        return node != null;
    }

    private Node findNode(int element) {
        Node node = rootNode;
        while (node != null) {
            if (element == node.getValue()) {
                return node;
            }
            if (element < node.getValue()) {
                node = node.getLeftChild();
            } else {
                node = node.getRightChild();
            }
        }
        return null;

    }

    @Override
    public Node getRootNode() {
        return rootNode;
    }

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        if (findElement(element)) {
            Node node = findNode(element);
            childChecker(node.isLeftChildEmpty());
            return node.getLeftChild().getValue();
        } else {
            throw new ChildNotFoundException();
        }
    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        if (findElement(element)) {
            Node node = findNode(element);
            childChecker(node.isRightChildEmpty());
            return node.getRightChild().getValue();
        } else {
            throw new ChildNotFoundException();
        }
    }

    private static void childChecker(boolean node) throws ChildNotFoundException {
        if (node) {
            throw new ChildNotFoundException();
        }
    }

    @Override
    public int getRootElement() {
        return rootNode.getValue();
    }

    @Override
    public int getNumberOfElements() {

        return numOfNodes;
    }

    @Override
    public void addElement(int element) {
        addNodeToTree(rootNode, element);
    }

    @Override
    public void addElements(int[] elements) {

        for (int i = 0; i < elements.length; i++) {
            addElement(elements[i]);
        }
    }

    private int index = 0;
    @Override
    public int[] getSortedTreeAsc() {
        index = 0;
        int[] sortedTree = new int[numOfNodes-1];
        double Out = System.nanoTime();
        sortAsc(rootNode, sortedTree);
        double end = System.nanoTime();
        return sortedTree;
    }

    private void sortAsc(Node node, int[] sortedTree) {
        if (!node.isLeftChildEmpty()) {
            sortAsc(node.getLeftChild(), sortedTree);
        }
        sortedTree[index++] = node.getValue();
        if (!node.isRightChildEmpty()) {
            sortAsc(node.getRightChild(), sortedTree);
        }
    }

    @Override
    public int[] getSortedTreeDesc() {
        index = 0;
        int[] sortedTree = new int[numOfNodes-1];
        sortDesc(rootNode, sortedTree);
        return sortedTree;
    }

    private void sortDesc(Node node, int[] sortedTree) {
        if (!node.isRightChildEmpty()) {
            sortDesc(node.getRightChild(), sortedTree);
        }
        sortedTree[index++] = node.getValue();
        if (!node.isLeftChildEmpty()) {
            sortDesc(node.getLeftChild(), sortedTree);

        }
    }
}
