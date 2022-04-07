package com.company.singlylinkedlist;

public class deleteNode {

    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void deleteNode(int position){
        if(position == 1){
            head = head.next;


        }
        else{
            ListNode previous = head;
            int count = 1;
            while (count < position - 1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;

        }

    }

    public void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        deleteNode dn = new deleteNode();
        dn.head = new ListNode(10);
        ListNode second = new ListNode(11);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(5);

        dn.head.next = second;
        second.next = third;
        third.next = fourth;

        dn.deleteNode(3);
        dn.display();

        dn.deleteNode(1);
        dn.display();
    }
}
