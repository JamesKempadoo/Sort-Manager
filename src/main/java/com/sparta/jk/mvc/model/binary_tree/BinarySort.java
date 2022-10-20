package com.sparta.jk.mvc.model.binary_tree;

import com.sparta.jk.exceptions.ChildNotFoundException;

public class BinarySort implements BinaryTreeSortable {
    private final Node rootNode;
    private int numOfNodes = 1;

    public BinarySort(int element) {  //can't have a tree without a root Node
        this.rootNode = new Node(element);
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
        } else if (element >= node.getValue()) {
            if (node.isRightChildEmpty()) {
                node.setRightChildNode(new Node(element));
                numOfNodes++;
            } else {
                addNodeToTree(node.getRightChild(), element);
            }
        }
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
        int[] sortedTree = new int[numOfNodes];
        sortAsc(rootNode, sortedTree);
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
        int[] sortedTree = new int[numOfNodes];
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
