package com.hypocrite30.chapter1.package08;

/**
 * @Description: 同步省略说明
 * @Author: Hypocrite30
 * @Date: 2021/6/8 12:22
 */
public class SynchronizedTest {
    public void f() {
        Object hollis = new Object();
        synchronized (hollis) {
            System.out.println(hollis);
        }
    }
}
