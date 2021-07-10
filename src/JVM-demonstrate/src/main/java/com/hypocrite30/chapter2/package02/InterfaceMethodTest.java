package com.hypocrite30.chapter2.package02;

/**
 * @Description: 补充：方法调用指令的补充说明
 * @Author: Hypocrite30
 * @Date: 2021/7/10 11:36
 */
public class InterfaceMethodTest {
    public static void main(String[] args) {
        AA aa = new BB();

        aa.method2();

        AA.method1();
    }
}

interface AA {
    public static void method1() {

    }

    public default void method2() {

    }
}

class BB implements AA {

}