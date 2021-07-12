package com.hypocrite30.chapter2.package03;

import org.junit.Test;

import java.util.Random;

/**
 * 3. 当使用类、接口的静态字段时(final修饰特殊考虑)，比如，使用getstatic或者putstatic指令。（对应访问变量、赋值变量操作）
 * @Author: Hypocrite30
 * @Date: 2021/7/12 11:54
 */
public class ActiveUse2 {
    @Test
    public void test1() {
        // System.out.println(User.num);  // 会导致 初始化
        // System.out.println(User.num1);  // 不会导致 初始化，在Linking的准备阶段就完成了
        System.out.println(User.num2);  // 会导致 初始化
    }

    @Test
    public void test2() {
        // System.out.println(CompareA.NUM1);  // 不会导致 初始化
        System.out.println(CompareA.NUM2);  // 会导致 初始化
    }
}

class User {
    static {
        System.out.println("User类的初始化过程");
    }

    public static int num = 1;
    public static final int num1 = 1;
    public static final int num2 = new Random().nextInt(10);
}

interface CompareA {
    public static final Thread t = new Thread() {
        {
            System.out.println("CompareA的初始化");
        }
    };

    public static final int NUM1 = 1;
    public static final int NUM2 = new Random().nextInt(10);
}