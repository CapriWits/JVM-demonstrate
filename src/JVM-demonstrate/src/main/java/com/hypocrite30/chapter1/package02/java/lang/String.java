package com.hypocrite30.chapter1.package02.java.lang;

/**
 * @Description: 双亲委派机制 自定义String
 * @Author: Hypocrite30
 * @Date: 2021/6/3 19:39
 */
public class String {
    /**
     * 实际上并不会加载到自定义的String
     * 双亲委派一直传到 引导类加载器，这样就加载了官方的String
     */
    static {
        System.out.println("我是自定义的String类的静态代码块");
    }
   // 错误: 在类 java.lang.String 中找不到 main 方法
   // public static void main(String[] args) {
   //     System.out.println("hello,String");
   // }
}
