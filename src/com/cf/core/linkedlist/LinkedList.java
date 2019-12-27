package com.cf.core.linkedlist;

public class LinkedList {

    public static void main(String[] args) {
        LinkedNode initNodeList = initNodeList();
        printLinkList(initNodeList);

        LinkedNode reverseNodeList = reverseNodeList(initNodeList);
        printLinkList(reverseNodeList);
    }

    /**
     * 初始化单链表
     *
     */
    public static LinkedNode initNodeList() {
        LinkedNode lastNode = new LinkedNode("last", null);
        LinkedNode node4 = new LinkedNode("4", lastNode);
        LinkedNode node3 = new LinkedNode("3", node4);
        LinkedNode node2 = new LinkedNode("2", node3);
        return new LinkedNode("1", node2);
    }

    /**
     * 反转
     *
     * @param node link https://blog.csdn.net/xu491361421xiao/article/details/81385435
     */
    public static LinkedNode reverseNodeList(LinkedNode node) {
        if (node.next == null) { // 就一个节点,不用反转
            return node;
        }
        LinkedNode p = node;
        LinkedNode newH = null;
        while (p != null) {
            LinkedNode tmp = p.next; //暂存p下一个地址，防止变化指针指向后找不到后续的数
            p.next = newH; //p.next指向前一个空间
            newH = p; //新链表的头移动到p，扩长一步链表
            p = tmp; //p指向原始链表p指向的下一个空间
        }
        return newH;
    }


    /**
     * 遍历展示
     */
    public static void printLinkList(LinkedNode node) {
        LinkedNode p = node;
        while (p != null) {
            System.out.println(p.name);
            p = p.next;
        }
        System.out.println("---end");
    }
}
