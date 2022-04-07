package com.company.singlylinkedlist;

public class strtingNodeInALoop {
    private ListNode head;

    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void createLoopInLinkedList(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);

        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;
    }

    public boolean containsLoopOrNot(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while (fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

            if(slowPtr == fastPtr) return true;
        }
        return false;
    }

    public ListNode startingNodeInALoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while (fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

            if(slowPtr == fastPtr) {
                return getStartingNode(slowPtr);
            }
        }
        return null;
    }

    private ListNode getStartingNode(ListNode slowPtr) {
        ListNode temp = head;
        while ( slowPtr != temp){
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        return temp;
    }

    public static void main(String[] args) {
        strtingNodeInALoop snl = new strtingNodeInALoop();
        snl.createLoopInLinkedList();
        System.out.println(snl.containsLoopOrNot());
        System.out.println(snl.startingNodeInALoop().data);

    }
}
