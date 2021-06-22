package com.hypocrite30.chapter1.package13;

/**
 * String的垃圾回收:
 * -Xms15m -Xmx15m -XX:+PrintStringTableStatistics -XX:+PrintGCDetails
 * @Description: 测试new sting()的gc行为
 * @Author: Hypocrite30
 * @Date: 2021/6/19 11:22
 */
public class StringGCTest {
    public static void main(String[] args) {
        for (int j = 0; j < 100000; j++) {  // 循环次数从100调到100000
            String.valueOf(j).intern();
        }
    }
}
