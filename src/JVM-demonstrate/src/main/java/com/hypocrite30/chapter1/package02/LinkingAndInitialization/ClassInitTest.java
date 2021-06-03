package com.hypocrite30.chapter1.package02.LinkingAndInitialization;

/**
 * @Description: intialization静态变量加载顺序
 * @Author: Hypocrite30
 * @Date: 2021/6/3 11:16
 */
public class ClassInitTest {
    /**
     * 初始化阶段是执行类构造器方法<clinit>()的过程
     * 此方法不需要定义，是javac编译器自动收集类中所有静态变量的赋值动作和静态代码块中的语句合并来的
     */
    private static int num = 1;

    static {
        num = 2;
        number = 20;
        System.out.println(num);
        //System.out.println(number);//报错：非法的前向引用。
    }

    private static int number = 10;  //linking之prepare: number = 0 --> initial: 20 --> 10

    public static void main(String[] args) {
        System.out.println(ClassInitTest.num);//2
        System.out.println(ClassInitTest.number);//10
    }
}
