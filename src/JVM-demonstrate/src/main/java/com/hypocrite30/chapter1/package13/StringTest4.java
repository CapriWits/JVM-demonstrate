package com.hypocrite30.chapter1.package13;

/**
 * @Author: Hypocrite30
 * @Date: 2021/6/17 17:55
 */
public class StringTest4 {
    public static void main(String[] args) {
        System.out.println();  // 常量池中字符串个数：2166
        System.out.println("1");  // 2167
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");  // 2170
        //如下的字符串"1" 到 "4"不会再次加载
        System.out.println("1");  // 2171
        System.out.println("2");  // 2171
        System.out.println("3");
        System.out.println("4");  // 2171
    }
}
