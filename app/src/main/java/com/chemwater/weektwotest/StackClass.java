package com.chemwater.weektwotest;

import java.util.ArrayList;
import java.util.Stack ;
//Stack is a Last In First Out data structure. It supports two basic operations called push and pop.
//The push operation adds an element at the top of the stack, and the pop operation removes an
//element from the top of the stack

public class StackClass {

    static Stack<Integer> stackOne, stackTwo ;
    static ArrayList<Integer> queue = new ArrayList<>() ;
    static int[] anArray = {1, 2, 3, 4, 5, 6, 7, 8, 9} ;
    static int B = 3 ;

    public static void main(String[] args) {
        //Creating a Stack
        stackOne = new Stack<>() ;
        stackTwo = new Stack<>() ;


        enQueue(anArray) ;
        deQueue(B) ;
    }

    public static void enQueue(int[] a) {
        for(int aa: a)
            queue.add(stackTwo.push(stackOne.push(aa))) ;
        System.out.println(queue) ;
    }

    public static void deQueue(int b) {

        queue.remove(0) ;

        System.out.println(queue) ;

    }

}