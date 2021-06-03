package com.hypocrite30.chapter1.package02.Loading;

/**
 * @Description: 双亲委派机制 对 String的测试
 * @Author: Hypocrite30
 * @Date: 2021/6/3 20:06
 */
public class StringTest {
    public static void main(String[] args) {
        java.lang.String str = new java.lang.String();
        System.out.println("hello");

        StringTest test = new StringTest();
        System.out.println(test.getClass().getClassLoader());
    }
}
