package com.company.singlylinkedlist;

public class InsertAtFirst {

    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;

        }

    }

    public void display(){
        ListNode current = head ;
        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;

        }
        System.out.println("null");
    }

    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        InsertAtFirst iaf = new InsertAtFirst();
        iaf.insertFirst(11);
        iaf.insertFirst(8);
        iaf.insertFirst(1);

        iaf.display();
    }
}
