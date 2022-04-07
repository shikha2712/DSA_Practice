package com.company.singlylinkedlist;

public class listContainsLoopOrNot {
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

    public static void main(String[] args) {
        listContainsLoopOrNot lcn = new listContainsLoopOrNot();
        lcn.createLoopInLinkedList();
        System.out.println(lcn.containsLoopOrNot());
    }
}
