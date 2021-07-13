package com.hypocrite30.chapter2.package04.DIYClassLoader;

/**
 * @Description: 自定义类加载器测试
 * @Author: Hypocrite30
 * @Date: 2021/7/13 11:25
 */
public class MyClassLoaderTest {
    public static void main(String[] args) {
        // class 文件路径
        MyClassLoader loader = new MyClassLoader("d:/");
        try {
            Class clazz = loader.loadClass("Demo1");
            System.out.println("加载此类的类的加载器为：" + clazz.getClassLoader().getClass().getName());

            System.out.println("加载当前Demo1类的类的加载器的父类加载器为：" + clazz.getClassLoader().getParent().getClass().getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
