package com.company.singlylinkedlist;

public class reverseList {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;


        }
    }

    public ListNode reverse(){
        if(head == null){
            return  head;
        }

        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;

    }

    public void  display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        reverseList rl = new reverseList();
        rl.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        rl.head.next = second;
        second.next = third;
        third.next = fourth;

        rl.display();
        rl.reverse();
        rl.display();


    }
}
