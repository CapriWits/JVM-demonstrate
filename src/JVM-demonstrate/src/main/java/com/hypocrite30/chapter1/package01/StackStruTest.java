package com.hypocrite30.chapter1.package01;

/**
 * @Description: 「JVM基于栈式架构」
 * @Author: Hypocrite30
 * @Date: 2021/6/2 22:03
 */
public class StackStruTest {
    public static void main(String[] args) {
        int i = 2;
        int j = 3;
        int k = i + j;
        // jsp 查看正在运行的进程及进程号，延迟6s
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(k);
    }
}
