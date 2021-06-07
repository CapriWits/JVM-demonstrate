package com.hypocrite30.chapter1.package08;

/**
 * @Description: -Xms10m -Xmx10m 堆实例Demo 与 HeapDemo1
 * @Author: Hypocrite30
 * @Date: 2021/6/6 21:16
 */
public class HeapDemo {
    public static void main(String[] args) {
        System.out.println("start...");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end...");
    }
}
