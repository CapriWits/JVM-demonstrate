package com.hypocrite30.chapter1.package13;

/**
 * @Description: 面试题变型，只交换两行代码
 * @Author: Hypocrite30
 * @Date: 2021/6/18 22:02
 */
public class StringIntern1 {
    public static void main(String[] args) {
        // StringIntern.java中练习的拓展：
        String s3 = new String("1") + new String("1");  // new String("11")的地址
        // 执行完上一行代码以后，字符串常量池中，是否存在"11"呢？答案：不存在！！
        String s4 = "11";  // 在字符串常量池中生成对象"11"
        String s5 = s3.intern();
        System.out.println(s3 == s4);  // false
        System.out.println(s5 == s4);  // true
    }
}
