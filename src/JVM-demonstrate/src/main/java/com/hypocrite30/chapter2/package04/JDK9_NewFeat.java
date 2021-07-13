package com.hypocrite30.chapter2.package04;

/**
 * @Description: JDK9 新特性
 * @Author: Hypocrite30
 * @Date: 2021/7/13 11:36
 */
public class JDK9_NewFeat {
    public static void main(String[] args) {
        System.out.println(ClassLoaderTest.class.getClassLoader());
        System.out.println(ClassLoaderTest.class.getClassLoader().getParent());
        System.out.println(ClassLoaderTest.class.getClassLoader().getParent().getParent());

        //获取系统类加载器
        // System.out.println(ClassLoader.getSystemClassLoader());
        //获取平台类加载器
        // System.out.println(ClassLoader.getPlatformClassLoader());
        //获取类的加载器的名称
        // System.out.println(ClassLoaderTest.class.getClassLoader().getName());
    }
}
