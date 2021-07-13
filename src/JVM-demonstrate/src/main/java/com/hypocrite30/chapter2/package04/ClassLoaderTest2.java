package com.hypocrite30.chapter2.package04;

/**
 * @Author: Hypocrite30
 * @Date: 2021/7/13 9:48
 */
public class ClassLoaderTest2 {
    public static void main(String[] args) {
        // Object是 java.lang 包下的，所以是由引导类加载器加载的
        // 因为双亲委派机制，所以 Object 类的加载只能使用引导类加载器进行！
        Object object = new Object();
    }
}
