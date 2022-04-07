package com.company.singlylinkedlist;

public class InsertNode {

    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insertNode(int data,int position){
        ListNode node = new ListNode(data);
        if(position == 1){
            node.next = head;
            head = node;
        }
        else{
            ListNode previous = head;
            int count = 1;
            while(count < position - 1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            node.next = current;
            previous.next = node;
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
        InsertNode in = new InsertNode();
        in.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);

        in.head.next = second;
        second.next = third;

        in.insertNode(7,3);
        in.insertNode(11,4);
        in.insertNode(15,1);
        in.display();

    }
}
