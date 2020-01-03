package com.cf.core.array;

public class GenericArray {

    private String[] data;
    private int size; // 当前元素个数
    private final int capacity = 5;

    // 构造Array
    GenericArray(){
        this.data = new String[capacity];
        size = 0;
    }

    /**
     * 头部出入，插入点后的内容往后移动
     * @param str
     */
    public void addFirst(String str){
        add(0,str);
    }

    /**
     * 尾部插入
     * @param str
     */
    public void addLast(String str){
        add(size, str);
    }

    /**
     * 在index处插入str
     * @param index
     * @param str
     */
    public void add(int index,String str){
        if(index < 0 || index > size){
            throw new IllegalArgumentException("index不合法");
        }
        // 放满了,扩容
        if(size == data.length){
            resize(2 * data.length);
        }

        // 把插入点后边的内容往后移
        for(int i = size-1; i >= index; i--){
            data[i+1] = data[i];
        }

        // 放入值
        data[index] = str;

        // 容量加1
        size ++;
    }

    /**
     * 扩充容量，做一次搬移
     * @param capacity
     */
    public void resize(int capacity){
        String[] newData = new String[capacity];
        for(int i = 0; i < size; i++){
            newData[i] = data[i];
        }
        data = newData;
    }


    /**
     * 删除内容
     * @param {index}
     */
    public void remove(int index){
        // 边界校验
        if(index < 0 || index >= data.length){
            throw  new IllegalArgumentException("数组越界");
        }

        // index之后的内容往前移动
        for(int i = index + 1; i < size; i++ ){
            data[i-1] = data[i];
        }

        size --;
        // 最后一个内容设置成null
        data[size] = null;

        // 缩容
        if(size == data.length/4 && data.length/2 != 0){
            resize(data.length/2);
        }
    }

    /**
     * 删除头部
     * @return
     */
    public void removeFirst(){
        remove(0);
    }

    /**
     * 删除尾部
     * @return
     */
    public void removeLast(){
        remove(size-1);
    }


    public String[] getData() {
        return data;
    }


    public static void main(String[] args) {
        GenericArray ga = new GenericArray();
        ga.addLast("1");
        ga.addLast("3");
        ga.addLast("4");
        ga.addLast("5");
        ga.addLast("6");
        ga.add(1,"2");

        ga.removeFirst();
        ga.removeLast();
        ga.removeLast();
        ga.removeLast();
        ga.removeLast();


        for(String s: ga.getData()){
            System.out.println(s);
        }

    }
}
