package com.hypocrite30.chapter1.package02.Loading;

/**
 * @Description: 获取ClassLoader的三种方式
 * @Author: Hypocrite30
 * @Date: 2021/6/3 19:12
 */
public class ClassLoaderTest2 {
    public static void main(String[] args) {
        try {
            //1. 获取当前类的ClassLoader
            ClassLoader classLoader = Class.forName("java.lang.String").getClassLoader();
            System.out.println(classLoader);
            //2. 获取当前线程上下文的ClassLoader
            ClassLoader classLoader1 = Thread.currentThread().getContextClassLoader();
            System.out.println(classLoader1);
            //3. 获取系统的ClassLoader
            ClassLoader classLoader2 = ClassLoader.getSystemClassLoader().getParent();
            System.out.println(classLoader2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
