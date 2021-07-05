package com.hypocrite30.chapter1.package16;

/**
 * VM args: -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC
 * 堆: 20M 新生代和老年代: 10M 新生代: 8 + 1 + 1M
 * @Description: 在jdk7 和 jdk8 中分别执行，观察内存变化
 * @Author: Hypocrite30
 * @Date: 2021/7/5 15:56
 */
public class GCLogTest1 {
    private static final int _1MB = 1024 * 1024;

    public static void testAllocation() {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation4 = new byte[4 * _1MB];
    }

    public static void main(String[] agrs) {
        testAllocation();
    }
}
