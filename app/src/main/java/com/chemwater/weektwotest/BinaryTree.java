package com.chemwater.weektwotest;

/**
 * Created by dariuswalker on 2/22/19.
 */

public class BinaryTree<T> implements  BinaryTreeInterface {
    private BinaryNode<T> root ;

    public BinaryTree() {
        root = null ;
    }

    public BinaryTree(T rootData) {
        root = new BinaryNode<>(rootData) ;
    }

    public BinaryTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree) {
        privateSetTree(rootData, leftTree, rightTree) ;
    }

    public void setTree(T rootData) {
        root = new BinaryNode<>(rootData) ;
    }

    
    public void setTree(T rootData, BinaryTreeInterface<T> leftTree, BinaryTreeInterface<T> rightTree) {
        privateSetTree(rootData, (BinaryTree<T>) leftTree, (BinaryTree<T>)rightTree) ;
    }

    private void privateSetTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree) {
        root = new BinaryNode<>(rootData) ;

        if(leftTree != null)
            root.setLeftChild(leftTree.root) ;

        if(rightTree != null){
            root.setRightChild(rightTree.root) ;
    }


}
