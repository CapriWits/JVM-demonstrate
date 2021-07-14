package com.hypocrite30.chapter3.package02.jvisualvm;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Description: -Xms600m -Xmx600m -XX:SurvivorRatio=8
 * @Author: Hypocrite30
 * @Date: 2021/7/14 22:39
 */
public class HeapInstanceTest {
    byte[] buffer = new byte[new Random().nextInt(1024 * 100)];

    public static void main(String[] args) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
