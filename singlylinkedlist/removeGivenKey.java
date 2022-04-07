package com.company.singlylinkedlist;

public class removeGivenKey {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void displayList(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void removeKey(int key){
        ListNode current = head;
        ListNode temp = null;

        if(current != null && current.data == key){
            head = current.next;
            return;
        }

        while(current != null && current.data != key){
            temp = current;
            current = current.next;
        }
        if(current == null) return;
        temp.next = current.next;
    }

    public static void main(String[] args) {
        removeGivenKey rgk = new removeGivenKey();
        rgk.head = new ListNode(10);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(11);
        ListNode fifth = new ListNode(16);

        rgk.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        rgk.displayList();
        rgk.removeKey(7);
        rgk.displayList();
    }
}
