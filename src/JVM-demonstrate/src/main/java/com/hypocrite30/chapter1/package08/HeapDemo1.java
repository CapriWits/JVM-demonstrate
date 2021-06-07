package com.hypocrite30.chapter1.package08;

/**
 * @Description: -Xms20m -Xmx20m 堆实例Demo 对应
 * @Author: Hypocrite30
 * @Date: 2021/6/6 21:17
 */
public class HeapDemo1 {
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
