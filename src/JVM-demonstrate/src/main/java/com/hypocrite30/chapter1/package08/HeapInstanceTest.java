package com.hypocrite30.chapter1.package08;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Description: -Xms600m -Xmx600m
 * @Author: Hypocrite30
 * @Date: 2021/6/7 22:27
 */
public class HeapInstanceTest {
    byte[] buffer = new byte[new Random().nextInt(1024 * 200)];

    public static void main(String[] args) {
        ArrayList<HeapInstanceTest> list = new ArrayList<HeapInstanceTest>();
        while (true) {
            list.add(new HeapInstanceTest());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
