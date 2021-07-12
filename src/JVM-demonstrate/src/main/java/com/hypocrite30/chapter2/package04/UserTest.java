package com.hypocrite30.chapter2.package04;

/**
 * @Description: 显式加载和隐式加载例子
 * @Author: Hypocrite30
 * @Date: 2021/7/12 16:28
 */
public class UserTest {
    public static void main(String[] args) {
        User user = new User(); // 隐式加载
        try {
            Class.forName("com.hypocrite30.chapter2.package04.User"); // 显式加载
            ClassLoader.getSystemClassLoader().loadClass("com.hypocrite30.chapter2.package04.User"); // 显式加载
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
