package com.hypocrite30.chapter1.package14;

import java.util.ArrayList;

/**
 * -Xms8m -Xmx8m -XX:+HeapDumpOnOutOfMemoryError
 * @Author: Hypocrite30
 * @Date: 2021/6/22 15:29
 */
public class HeapOOM {
    byte[] buffer = new byte[1 * 1024 * 1024];  // 1MB

    public static void main(String[] args) {
        ArrayList<HeapOOM> list = new ArrayList<>();

        int count = 0;
        try {
            while (true) {
                list.add(new HeapOOM());
                count++;
            }
        } catch (Throwable e) {
            System.out.println("count = " + count);
            e.printStackTrace();
        }
    }
}
