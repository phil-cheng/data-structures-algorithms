package com.cf.core.stack;

import com.cf.core.linkedlist.LinkedNode;

public class ArrayStack {
    private String[] items;
    private int count; // 栈中元素个数
    private int n; // 栈的大小

    public ArrayStack(int n) {
        this.items = new String[n];
        this.n = n;
        this.count = 0;
    }

    /**
     * 压栈
     */
    public boolean push(String s){
        // 栈满了
        if(count ==  n){
            return false;
        }
        items[count] = s;
        ++count;
        return true;
    }

    /**
     * 出栈
     */
    public String pop(){
        if(count == 0){// 空栈,无须出栈
            return null;
        }
        String tmp = items[count-1];
        items[count-1] = null;
        --count;
        return tmp;
    }


    public String[] getItems() {
        return items;
    }

    /**
     * print stack
     */
    public void printStack(String[] strArray){
        for(String s: strArray){
            System.out.println(s);
        }
    }


    public static void main(String[] args) {
        ArrayStack as = new ArrayStack(5);
        as.push("1");
        as.push("2");
        as.push("3");
        as.pop();
        as.printStack(as.getItems());
    }

}
