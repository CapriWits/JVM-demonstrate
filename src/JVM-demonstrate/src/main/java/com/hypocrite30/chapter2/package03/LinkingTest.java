package com.hypocrite30.chapter2.package03;

/**
 * 基本数据类型：非 final 修饰的变量，在准备环节进行默认初始化赋值。
 * final修饰以后，在准备环节直接进行显示赋值。
 * 拓展：如果使用字面量的方式定义一个字符串的常量的话，也是在准备环节直接进行显示赋值。
 * @Description: 过程二：链接阶段
 * @Author: Hypocrite30
 * @Date: 2021/7/11 22:53
 */
public class LinkingTest {
    private static long id;  //
    private static final int num = 1;  //

    public static final String constStr = "CONST";
//    public static final String constStr1 = new String("CONST");

    public Object getObj() {
        return null;
    }

    public void print1() {
        System.out.println("hello");
    }
}
