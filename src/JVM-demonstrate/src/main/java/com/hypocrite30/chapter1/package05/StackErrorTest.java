package com.hypocrite30.chapter1.package05;

/**
 * @Description: 演示栈中的异常:StackOverflowError
 * @Author: Hypocrite30
 * @Date: 2021/6/4 12:00
 */
public class StackErrorTest {
    /**
     * 默认情况下：count: 11424 取决于平台
     * 设置栈的大小： -Xss256k : count : 2454
     */
    private static int count = 1;

    public static void main(String[] args) {
        System.out.println(count);
        count++;
        main(args); // StackOverflowError
    }
}
