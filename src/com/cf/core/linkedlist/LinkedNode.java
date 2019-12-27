package com.cf.core.linkedlist;

public class LinkedNode {

    public String name;
    public LinkedNode next;

    public LinkedNode(String name, LinkedNode next) {
        this.name = name;
        this.next = next;
    }

    public String getName() {
        return name;
    }
}
