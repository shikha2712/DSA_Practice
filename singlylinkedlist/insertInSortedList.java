package com.company.singlylinkedlist;

public class insertInSortedList {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtBegin(int data){
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public ListNode insertInSortedList(int value){
        ListNode newNode = new ListNode(value);

        if(head == null){
            return newNode;
        }

        ListNode current = head;
        ListNode temp = null;

        while(current != null && current.data < newNode.data){
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        return head;

    }

    public static void main(String[] args) {
        insertInSortedList isl = new insertInSortedList();
        isl.insertAtBegin(16);
        isl.insertAtBegin(10);
        isl.insertAtBegin(8);
        isl.insertAtBegin(1);


        isl.display();
        isl.insertInSortedList(11);
        isl.insertInSortedList(9);
        isl.display();


    }
}
