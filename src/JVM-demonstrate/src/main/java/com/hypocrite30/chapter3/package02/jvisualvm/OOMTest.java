package com.hypocrite30.chapter3.package02.jvisualvm;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Description: -Xms600m -Xmx600m -XX:SurvivorRatio=8
 * @Author: Hypocrite30
 * @Date: 2021/7/14 22:38
 */
public class OOMTest {
    public static void main(String[] args) {
        ArrayList<Picture> list = new ArrayList<>();
        while (true) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add(new Picture(new Random().nextInt(100 * 50)));
        }
    }
}

class Picture {
    private byte[] pixels;

    public Picture(int length) {
        this.pixels = new byte[length];
    }
}
