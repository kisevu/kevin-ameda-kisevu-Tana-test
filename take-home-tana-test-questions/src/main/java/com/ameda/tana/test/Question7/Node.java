package com.ameda.tana.test.Question7;

/**
 * Author: kev.Ameda
 */
public class Node {
    String val;
    Node next;

    Node( String val ){
        this. val = val;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
