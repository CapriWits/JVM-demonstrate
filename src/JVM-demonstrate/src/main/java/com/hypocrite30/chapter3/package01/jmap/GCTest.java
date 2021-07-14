package com.hypocrite30.chapter3.package01.jmap;

import java.util.ArrayList;

/**
 * @Description: -Xms60m -Xmx60m -XX:SurvivorRatio=8
 * @Author: Hypocrite30
 * @Date: 2021/7/14 18:20
 */
public class GCTest {
    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            byte[] arr = new byte[1024 * 100];  // 100KB
            list.add(arr);
            try {
                Thread.sleep(120);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
