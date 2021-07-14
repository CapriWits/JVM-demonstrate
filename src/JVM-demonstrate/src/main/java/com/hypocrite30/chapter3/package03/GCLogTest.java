package com.hypocrite30.chapter3.package03;

import java.util.ArrayList;

/**
 * @Description: -Xms60m -Xmx60m -XX:SurvivorRatio=8
 * @Author: Hypocrite30
 * @Date: 2021/7/14 22:45
 */
public class GCLogTest {
    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<>();

        for (int i = 0; i < 500; i++) {
            byte[] arr = new byte[1024 * 100];//100KB
            list.add(arr);
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
