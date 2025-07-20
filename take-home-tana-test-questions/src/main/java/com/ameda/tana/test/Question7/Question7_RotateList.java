package com.ameda.tana.test.Question7;

/**
 * Author: kev.Ameda
 */
public class Question7_RotateList {

    // This is a List rotation problem
    public static void main(String[] args) {
        String[] values = {
                "ID_A01", "ID_A02", "ID_A03", "ID_A04", "ID_A05", "ID_A06"
        };

        int n = 2; // Rotate right by 2

        Node head = buildList(values);
        Node rotated = rotateRight(head, n);

        printList(rotated);  // Should print: ID_A05->ID_A06->ID_A01->ID_A02->ID_A03->ID_A04->null
    }


    public static Node rotateRight( Node head, int n ){
        //TODO: Find the last element in the linkedlist
        //temp variable will be moved towards the last node
        // When temp.next points to null, then it means we have got the last element

        if( head == null || head.next == null || n == 0) return  head;

        // find the length and the last node
        int length = 1;
        Node tail =  head;
        while( tail.next !=null ){
            tail = tail.next;
            length++;
        }

        // make the list circular
        tail.next = head;

        // calculate new tail position
        n = n % length;
        int stepsToNewTail = length - n;
        Node newTail =  head;

        for( int i = 1; i < stepsToNewTail; i++ ){
            newTail = newTail.next;
        }

        // break the circle and return new head
        Node newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }


    // Utility methods
    public static Node buildList(String[] values) {
        if (values.length == 0) return null;
        Node head = new Node(values[0]);
        Node current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new Node(values[i]);
            current = current.next;
        }
        return head;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + "->");
            current = current.next;
        }
        System.out.println("null");
    }


    public static String stringify(Node head) {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.getVal()).append("->");
            current = current.getNext();
        }
        sb.append("null");
        return sb.toString();
    }


}
