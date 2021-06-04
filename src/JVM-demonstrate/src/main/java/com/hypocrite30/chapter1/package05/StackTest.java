package com.hypocrite30.chapter1.package05;

/**
 * @Description: VM stack演示
 * @Author: Hypocrite30
 * @Date: 2021/6/4 11:27
 */
public class StackTest {
    public static void main(String[] args) {
        StackTest test = new StackTest();
        test.methodA();
    }

    public void methodA() {
        int i = 10;
        int j = 20;
        methodB();
    }

    public void methodB() {
        int k = 30;
        int m = 40;
    }
}
