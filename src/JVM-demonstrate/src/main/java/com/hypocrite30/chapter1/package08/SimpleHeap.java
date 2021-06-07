package com.hypocrite30.chapter1.package08;

/**
 * @Description: 创建实例，堆的演示 -Xms20m -Xmx20m -XX:+PrintGCDetails
 * @Author: Hypocrite30
 * @Date: 2021/6/6 21:51
 */
public class SimpleHeap {
    private int id;  // 属性、成员变量

    public SimpleHeap(int id) {
        this.id = id;
    }

    public void show() {
        System.out.println("My ID is " + id);
    }

    public static void main(String[] args) {
        SimpleHeap sl = new SimpleHeap(1);
        SimpleHeap s2 = new SimpleHeap(2);

        int[] arr = new int[10];
        Object[] arr1 = new Object[10];
    }
}
