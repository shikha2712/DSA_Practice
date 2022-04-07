package com.company.singlylinkedlist;

public class nthNodeFromEnd {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;

        }
    }

    public ListNode nthNodeFromEnd(int n){
        if(head == null){
            return null;
        }

        if(n <= 0 ){
            throw new IllegalArgumentException("Invalid value : n = "+ n);
        }

        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count = 0;

        while(count < n){
            if(refPtr == null){
                throw new IllegalArgumentException( n +" is greater than the value of nodes in the given list ");
            }
            refPtr = refPtr.next;
            count++;
        }

        while(refPtr != null){
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;

        }
        return mainPtr;
    }

    public static void main(String[] args) {
        nthNodeFromEnd nfe = new nthNodeFromEnd();
        nfe.head = new ListNode(10);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(11);
        ListNode fifth = new ListNode(15);

        nfe.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        ListNode nthNode = nfe.nthNodeFromEnd(2);
        System.out.println( "Nth node from end is : "+nthNode.data );
    }
}
