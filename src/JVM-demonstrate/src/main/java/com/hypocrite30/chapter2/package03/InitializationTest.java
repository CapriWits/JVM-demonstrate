package com.hypocrite30.chapter2.package03;

/**
 * @Description: 过程三：初始化阶段
 * @Author: Hypocrite30
 * @Date: 2021/7/12 10:20
 */
public class InitializationTest {
    public static int id = 1;
    public static int number;

    static {
        number = 2;
        System.out.println("father static{}");
    }
}
