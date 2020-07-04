package cn.test.demo;

//public class mergeTwosorted {
//
//}

//
//
//
//class LinkedList {
//    Node head;
//    class Node{
//        int data;
//        Node next;
//        Node(int d){ data = d;}
//    }
//
//}


import java.io.*;
public class LinkedList{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(){
            data = d;
            next = null;
        }
    }
    public static LinkedList insert(LinkedList list, int data){
        Node new_node = new Node(data);
        new_node.next = null ;
        if (list.head == null) {
            last = last.next;
        }
        last.next = new_node;
    }

}