package com.test;

import java.util.List;

public class DoubleLinkedList {
    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode{
        private ListNode previous;
        private ListNode next;
        private int data;

        public ListNode(int data) {
            this.data = data;
            this.previous=null;
            this.next=null;
        }
    }

    public DoubleLinkedList() {
        this.head=null;
        this.tail=null;
        this.length=0;
    }

    public boolean isEmpty(){
        return length==0;
    }
    public int getLength(){
        return length;
    }

    public void printAll(){
        if(head==null){
            return;
        }
        ListNode temp= head;
        System.out.println();
        System.out.println("Printing in forward direction :");
        while(temp!=null){

            System.out.print(temp.data + "-->");
            temp=temp.next;
        }
        System.out.print("null");
    }

    public void printReverse(){
        if(tail==null){
            return;
        }
        ListNode temp=tail;
        System.out.println();
        System.out.println("Printing in Reverse direction");
        while (temp!=null){
            System.out.print(temp.data +"-->");
            temp=temp.previous;
        }
        System.out.print("null");
    }

    public void insertAtBegin(int data){
        ListNode temp = new ListNode(data);
        if(isEmpty()){
            tail=temp;
        }
        else{
            head.previous=temp;
        }
        temp.next=head;
        head=temp;
        length++;
    }

    public void insertAtEnd(int data){
        ListNode temp= new ListNode(data);
        if(isEmpty()){
            head=temp;
        }
        else{
           tail.next=temp;
        }
        temp.previous=tail;
        tail=temp;
        length++;
    }

}
