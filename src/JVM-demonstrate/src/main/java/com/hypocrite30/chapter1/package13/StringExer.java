package com.hypocrite30.chapter1.package13;

/**
 * @Description: 第一道面试题：考察字符串不变性
 * @Author: Hypocrite30
 * @Date: 2021/6/17 15:27
 */
public class StringExer {
    String str = new String("good");
    char[] ch = {'t', 'e', 's', 't'};

    public void change(String str, char ch[]) {
        // this.str = "test ok"; // this直接改变str的字面量，开辟新的字符串
        str = "test ok"; // 这里的str只是形参，不会改变成员变量的值
        ch[0] = 'b';
    }

    public static void main(String[] args) {
        StringExer ex = new StringExer();
        ex.change(ex.str, ex.ch);
        System.out.println(ex.str);  // good
        System.out.println(ex.ch);   // best
    }
}
