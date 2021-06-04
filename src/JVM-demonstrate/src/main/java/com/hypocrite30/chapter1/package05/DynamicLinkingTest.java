package com.hypocrite30.chapter1.package05;

/**
 * @Description: 动态链接 测试
 * @Author: Hypocrite30
 * @Date: 2021/6/4 21:45
 */
public class DynamicLinkingTest {
    int num = 10;

    public void methodA() {
        System.out.println("methodA()....");
    }

    public void methodB() {
        System.out.println("methodB()....");
        methodA();
        num++;
    }
}
