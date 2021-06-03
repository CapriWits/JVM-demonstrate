package com.hypocrite30.chapter1.package02.LinkingAndInitialization;

/**
 * @Description: Linking阶段的Prepare
 * @Author: Hypocrite30
 * @Date: 2021/6/3 11:07
 */
public class HelloApp {
    private static int a = 1; // prepare: a = 0; initialization: a = 1;

    public static void main(String[] args) {
        System.out.println(a);
    }
}
