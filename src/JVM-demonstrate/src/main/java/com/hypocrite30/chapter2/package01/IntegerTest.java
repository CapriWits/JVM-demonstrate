package com.hypocrite30.chapter2.package01;

/**
 * @Description: 字节码查看下列比较的细节
 * @Author: Hypocrite30
 * @Date: 2021/7/5 21:01
 */
public class IntegerTest {
    public static void main(String[] args) {
        Integer x = 5;
        int y = 5;
        System.out.println(x == y); // true

        Integer i1 = 10;
        Integer i2 = 10;
        System.out.println(i1 == i2);  // true

        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3 == i4);  // false
    }
}
