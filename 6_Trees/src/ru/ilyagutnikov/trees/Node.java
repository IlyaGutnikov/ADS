package ru.ilyagutnikov.trees;

/**
 * Created by IlyaGutnikov on 05.07.2017.
 */
public class Node {

    public NodeData nodeData;

    public Node leftChild;
    public Node rightChild;

    public void displayNode() {

        System.out.print(nodeData.toString());
    }
}
