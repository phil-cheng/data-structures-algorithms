package com.cf.core.sort;

/**
 * 冒泡排序
 * 冒泡排序只会操作相邻的两个数据。每次冒泡操作都会对相邻的两个元素进行比较，看是否满足大小关系要求。
 * 如果不满足就让它俩互换。一次冒泡会让至少一个元素移动到它应该在的位置
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {6,3,4,5,2,7};
        sort(a);

        // 输出
        for(int tmp: a){
            System.out.println(tmp);
        }

    }

    public static void sort(int[] a){
        int n = a.length;
        if( a == null || a.length <= 1){
            return;
        }
        for(int i=0; i < n; i++){
            boolean flag = false;
            for(int j=0; j < n-i - 1; j++){ // n-i-1：已排完须的值就不用再比较了，因为他们已经比较过了。
                if(a[j] > a[j+1]){
                    int tmp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = tmp;
                    flag = true; // 表示有数据交换
                }
            }
            if(!flag){// 内部如果没有交换了，则提前结束
                break;
            }
        }
    }

}
