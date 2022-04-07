package com.company.singlylinkedlist;

public class DeleteLast {

    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;


        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public ListNode deleteLast(){
        if(head == null || head.next == null){
            return  head;
        }
        ListNode current = head;
        ListNode previous = null;
        while(current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return  current;
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
        DeleteLast dl = new DeleteLast();
        dl.head = new ListNode(10);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(1);

        dl.head.next = second;
        second.next = third;

        System.out.println(dl.deleteLast().data);
        dl.display();

        System.out.println(dl.deleteLast().data);
        dl.display();
    }
}
