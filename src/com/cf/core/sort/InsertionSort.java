package com.cf.core.sort;

/**
 * 插入排序
 * 首先，我们将数组中的数据分为两个区间，已排序区间和未排序区间。
 * 初始已排序区间只有一个元素，就是数组的第一个元素。
 * 插入算法的核心思想是取未排序区间中的元素，在已排序区间中找到合适的插入位置将其插入，并保证已排序区间数据一直有序。
 * 重复这个过程，直到未排序区间中元素为空，算法结束。
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] a = {6,3,4,5,2,7};
        sort(a);

        // 输出
        for(int tmp: a){
            System.out.println(tmp);
        }
    }

    public static void sort(int[] a){
        int length = a.length;
        if(length <= 1){
            return;
        }
        for(int i=1; i < length; ++i){ // 默认第一个元素为已排序区间，所以从第二个值开始比较
            int value = a[i]; // 用来比较的值，用其与已排序区间进行比较

            // 遍历已排序区间，进行比较
            int j = i-1; // 因为每比较一次都会有一个结果进入到已排序区间，所以j= i-1
            for(; j>=0; j--){
                if(a[j] > value){
                    a[j+1] = a[j]; //当前值往后移动一位,以此类推直到找到value的合适位置，然后结束。
                }else{
                    break;
                }
            }
            // 把值插入到空出来的位置
            a[j+1] = value; // 加一的目的为找到合适位置之后，j做了一次减法运算
        }
    }
}
