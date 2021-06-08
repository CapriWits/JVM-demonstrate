package com.hypocrite30.chapter1.package08;

import java.util.ArrayList;
import java.util.List;

/**
 * -Xms9m -Xmx9m -XX:+PrintGCDetails
 * @Description: 测试MinorGC 、 MajorGC、FullGC
 * @Author: Hypocrite30
 * @Date: 2021/6/8 10:42
 */
public class GCTest {
    public static void main(String[] args) {
        int i = 0;
        try {
            List<String> list = new ArrayList<>();
            String a = "hypocrite30.com";
            while (true) {
                list.add(a);
                a = a + a;
                i++;
            }
        } catch (Throwable t) {
            t.printStackTrace();
            System.out.println("遍历次数为：" + i);
        }
    }
}
