package com.chemwater.weektwotest;

public class LinkedListClass {

    Node head ;

    static class Node {

        char data ;
        Node next ;

        //Constructor
        Node(char d) {
            data = d ;
            next = null ;
        }
    }


    //Method to insert a new node
    public static LinkedListClass insert(LinkedListClass list, char data) {
        //Create a new node with given data
        Node new_node = new Node(data) ;
        new_node.next = null ;

        //If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node ;
        } else {
            //Else traverse till the last node
            // and insert the new_node there
            Node last = list.head ;
            while (last.next != null) {
                last = last.next ;
            }
            //Insert the new_node at last node
            last.next = new_node ;
        }
        //Return the list by head
        return list ;
    }

    //Method to print the LinkedList
    public static void printList(LinkedListClass list) {
        Node currNode = list.head ;

        System.out.print("LinkedList: ") ;

        //Traverse through the LinkedList
        while(currNode != null) {
            //Print the data at current node
            System.out.println(currNode.data + " ") ;

            //Go to next node
            currNode = currNode.next ;
        }
    }



    //Driver code
    public static void main(String[] args) {
        //Start with the empty list.
        LinkedListClass list = new LinkedListClass() ;

        //
        // INSERTION
        //
        char d = ' ' ;

        String name = "Adbada Abdada" ;
        list = insert(list, d) ;

        for(int i = 0 ; i < name.length() ; i++) {
            //if(name.charAt(i) == ' ')
            list = insert(list, name.charAt(i)) ;
        }


        //Print the LinkedList
        printList(list) ;
    }


}