package com.test;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DoubleLinkedList doubleLinkedList= new DoubleLinkedList();
        doubleLinkedList.insertAtBegin(12);
        doubleLinkedList.insertAtBegin(13);
        doubleLinkedList.insertAtBegin(14);
        doubleLinkedList.insertAtBegin(15);
        doubleLinkedList.printAll();
        doubleLinkedList.printReverse();
        doubleLinkedList.insertAtEnd(23);
        doubleLinkedList.printAll();
    }
}
