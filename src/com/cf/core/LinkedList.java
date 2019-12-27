package com.cf.core;

class Node {

    public String name;
    public Node next;

    public Node(String name,Node next) {
        this.name = name;
        this.next = next;
    }
}

public class LinkedList {

    public static void main(String[] args) {
        Node initNodeList = initNodeList();
        printLinkList(initNodeList);

        Node reverseNodeList = reverseNodeList(initNodeList);
        printLinkList(reverseNodeList);
    }

    /**
     * 初始化单链表
     *
     */
    public static Node initNodeList() {
        Node lastNode = new Node("last", null);
        Node node4 = new Node("4", lastNode);
        Node node3 = new Node("3", node4);
        Node node2 = new Node("2", node3);
        return new Node("1", node2);
    }

    /**
     * 反转
     *
     * @param node link https://blog.csdn.net/xu491361421xiao/article/details/81385435
     */
    public static Node reverseNodeList(Node node) {
        if (node.next == null) { // 就一个节点,不用反转
            return node;
        }
        Node p = node;
        Node newH = null;
        while (p != null) {
            Node tmp = p.next; //暂存p下一个地址，防止变化指针指向后找不到后续的数
            p.next = newH; //p.next指向前一个空间
            newH = p; //新链表的头移动到p，扩长一步链表
            p = tmp; //p指向原始链表p指向的下一个空间
        }
        return newH;
    }


    /**
     * 遍历展示
     */
    public static void printLinkList(Node node) {
        Node p = node;
        while (p != null) {
            System.out.println(p.name);
            p = p.next;
        }
        System.out.println("---end");
    }
}
