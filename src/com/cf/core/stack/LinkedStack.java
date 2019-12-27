package com.cf.core.stack;

import com.cf.core.linkedlist.LinkedNode;

public class LinkedStack {
    private LinkedNode top = null;

    /**
     * 入栈
     * @param {node name}
     * @return result
     *
     */
    public boolean push(String s){
        LinkedNode node = new LinkedNode(s,null);
        if(top == null){
            top = node;
        }else{
            node.next = top;
            top = node; // top回到栈顶
        }
        return true;
    }


    /**
     * 出栈
     * @return
     */
    public String pop(){
        if(top == null){
            return null;
        }
        String tmp = top.getName();
        top = top.next; // 栈顶往下移动一位
        return tmp;
    }

    public LinkedNode getTop() {
        return top;
    }

    public void printStack(LinkedNode top){
        if(top == null){ //空栈
            System.out.println("空栈");
        }else {
            while(top != null){
                System.out.println(top.getName());
                top = top.next; // 指针下移
            }
        }
    }

    public static void main(String[] args) {
        LinkedStack ls = new LinkedStack();
        ls.push("1");
        ls.push("2");
        ls.push("3");
        ls.push("4");
        String tmp = ls.pop();
        System.out.println("top is:" + tmp);
        ls.printStack(ls.getTop());
    }


}
