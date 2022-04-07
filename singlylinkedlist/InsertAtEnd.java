package com.company.singlylinkedlist;

public class InsertAtEnd {

    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;

        }
    }

    public void insertEnd(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while(null != current.next){
            current = current.next;
        }
        current.next = newNode;
    }

    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        InsertAtEnd iae = new InsertAtEnd();

        iae.insertEnd(11);
        iae.insertEnd(8);
        iae.insertEnd(1);
        iae.insertEnd(7);

        iae.display();
    }
}
