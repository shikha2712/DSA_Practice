package com.company.singlylinkedlist;

public class SearchElement {

    private static ListNode head;


    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public boolean searchElement(ListNode head,int searchKey){
        if(head == null){
            return false;
        }
        ListNode current = head;
        while(current != null){
            if(current.data == searchKey){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        SearchElement se = new SearchElement();
        se.head = new ListNode(10);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(11);

        se.head.next = second;
        second.next = third;
        third.next = fourth;

        System.out.println("Given number is in the linked list -- " + se.searchElement(head,11));
        System.out.println("Given number is in the linked list -- " + se.searchElement(head,12));
    }
}
