package com.hypocrite30.chapter1.package12;

import java.util.ArrayList;

/**
 * @Description: 用jvisualvm 观察JIT编译器编译过程
 * @Author: Hypocrite30
 * @Date: 2021/6/16 21:11
 */
public class JITTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add("让天下没有难学的技术");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
