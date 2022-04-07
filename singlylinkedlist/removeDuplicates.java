package com.company.singlylinkedlist;

public class removeDuplicates {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtBegin(int data){
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void removeDuplicates(){
        ListNode current = head;

        while(current != null && current.next != null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        removeDuplicates rd = new removeDuplicates();
        rd.insertAtBegin(3);
        rd.insertAtBegin(3);
        rd.insertAtBegin(2);
        rd.insertAtBegin(1);
        rd.insertAtBegin(1);

        rd.display();
        rd.removeDuplicates();
        rd.display();




    }
}
