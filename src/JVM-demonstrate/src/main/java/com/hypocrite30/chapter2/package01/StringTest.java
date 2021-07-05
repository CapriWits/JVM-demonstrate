package com.hypocrite30.chapter2.package01;

/**
 * @Description: 字节码查看下列比较的细节
 * @Author: Hypocrite30
 * @Date: 2021/7/5 21:18
 */
public class StringTest {
    public static void main(String[] args) {
        String str = new String("hello") + new String("world");
        String str1 = "helloworld";
        System.out.println(str == str1);  // false
        String str2 = new String("helloworld");
        System.out.println(str == str2);  // false
    }

    public void method1() {

    }

    public void method1(int num) {

    }

//    public int method1(int num){
//        return 1;
//    }
}
