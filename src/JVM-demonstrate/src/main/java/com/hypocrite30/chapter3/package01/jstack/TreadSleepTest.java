package com.hypocrite30.chapter3.package01.jstack;

/**
 * @Description: 演示线程：TIMED_WAITING
 * @Author: Hypocrite30
 * @Date: 2021/7/14 21:57
 */
public class TreadSleepTest {
    public static void main(String[] args) {
        System.out.println("hello - 1");
        try {
            Thread.sleep(1000 * 60 * 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("hello - 2");
    }
}
