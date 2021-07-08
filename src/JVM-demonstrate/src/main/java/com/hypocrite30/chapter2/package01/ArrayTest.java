package com.hypocrite30.chapter2.package01;

/**
 * @Author: Hypocrite30
 * @Date: 2021/7/8 12:12
 */
public class ArrayTest {
    public static void main(String[] args) {
        Object[] arr = new Object[10];
        System.out.println(arr);  // [Ljava.lang.Object;@1540e19d

        String[] arr1 = new String[10];
        System.out.println(arr1);  // [Ljava.lang.String;@677327b6

        long[][] arr2 = new long[10][];
        System.out.println(arr2);  // [[J@14ae5a5
    }
}
