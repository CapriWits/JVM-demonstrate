package com.hypocrite30.chapter1.package02.LinkingAndInitialization;

/**
 * @Description: <clinit>() 与 <init>() 方法的区别
 * @Author: Hypocrite30
 * @Date: 2021/6/3 11:24
 */
public class ClinitTest {

    private int a = 1;
    private static int c = 3;

    public static void main(String[] args) {
        int b = 2;
    }

    /**
     * 任何一个类声明以后，内部至少存在一个类的构造器
     * 这里是手动创建的
     * 在虚拟机视角下是方法：<init>()
     */
    public ClinitTest() {
        a = 10;
        int d = 20;
    }
}