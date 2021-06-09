package com.hypocrite30.chapter1.package09;

/**
 * @Description: non-final的类变量
 * @Author: Hypocrite30
 * @Date: 2021/6/9 20:13
 */
public class MethodAreaTest {
    public static void main(String[] args) {
        Order order = null;
        order.hello();
        System.out.println(order.count);
    }
}

class Order {
    public static int count = 1;
    public static final int number = 2;

    public static void hello() {
        System.out.println("hello!");
    }
}


