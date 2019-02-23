package com.chemwater.weektwotest;

import java.util.Iterator ;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.Iterator ;

//A binary search tree is a binary tree whose nodes contain Comparable objects and are
// organized as follows. For each node in the tree,
//*The data in a node is greater than the data in the node's left subtree
//*The data in a node is less than the data in the node's right subtree





public class BinaryTreeClass<T extends Comparable<? super T>> extends BinaryTree<T> implements  SearchTreeInterface<T> {

    public BinaryTreeClass() {
        super() ;
    }

    public BinaryTreeClass(T rootEntry) {
        super() ;
        setRootNode(new BinaryNode<T>(rootEntry)) ;
    }

    public void setTree(T rootData) {
        throw new UnsupportedOperationException() ;
    }

    public void setTree(T rootData, BinaryTreeInterface<T> leftTree, BinaryTreeInterface<T> rightTree) {
        throw new UnsupportedOperationException() ;
    }

}



/*

//Left nodes, middle nodes, then the right nodes
//
4. Create and Binary Search tree with Add and print(preorder) method.

Input array: {50,32,13,65,34,22,3,76,90)
 */