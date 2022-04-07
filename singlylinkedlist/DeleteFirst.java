package com.company.singlylinkedlist;

public class DeleteFirst {

    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public ListNode deleteFirst(){
        if(head == null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
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
        DeleteFirst df = new DeleteFirst();
        df.head = new ListNode(10);
        ListNode second = new ListNode(11);
        ListNode third = new ListNode(8);

        df.head.next = second;
        second.next = third;

        System.out.println("Deleted element is " + df.deleteFirst().data);
        df.display();



    }
}
