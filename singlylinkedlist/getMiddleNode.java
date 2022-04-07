package com.company.singlylinkedlist;

public class getMiddleNode {
    private ListNode head;

    private static  class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;

        }
    }

    public ListNode getMiddleNode(){
        if(head == null){
            return  head;
        }

        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return  slowPtr;
    }


    public static void main(String[] args) {
        getMiddleNode gmn = new getMiddleNode();
        gmn.head = new ListNode(10);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(11);

        gmn.head.next = second;
        second.next = third;
        third.next = fourth;

        ListNode middleNode = gmn.getMiddleNode();
        System.out.println("Middle node is - "+ middleNode.data);

    }
}
