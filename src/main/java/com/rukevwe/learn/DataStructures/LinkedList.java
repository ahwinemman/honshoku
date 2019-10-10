package com.rukevwe.learn.DataStructures;

 class LinkedListNode {

   LinkedListNode next;
   int data;
   public LinkedListNode(int data){
       this.data = data;
   }
   
  
}

public class LinkedList {
    LinkedListNode head;

    public void append(int data) {
        if (head == null) {
            head = new LinkedListNode(data);
            return;
        }

        LinkedListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new LinkedListNode(data);
    }
    
    public void prepend(int data) {
        LinkedListNode newHead = new LinkedListNode(data);
        newHead.next = head;
        head = newHead;
    }
    
    public void deleteWithValue(int data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
            return;
        }

        LinkedListNode current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
}