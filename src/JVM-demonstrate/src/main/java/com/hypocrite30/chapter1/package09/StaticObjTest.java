package com.hypocrite30.chapter1.package09;

/**
 * 《深入理解Java虚拟机》中的案例：
 * staticObj、instanceObj、localObj存放在哪里？
 * @Author: Hypocrite30
 * @Date: 2021/6/10 16:09
 */
public class StaticObjTest {
    static class Test {
        // staticObj 是在 ObjectHolder 对象实例上，而 ObjectHolder 在堆上，所以静态变量是在堆上的
        static ObjectHolder staticObj = new ObjectHolder();
        // instanceObj 作为成员变量，存放在堆中
        ObjectHolder instanceObj = new ObjectHolder();

        void foo() {
            // localObj 局部变量是跟着方法存放在虚拟机栈的栈帧里的
            ObjectHolder localObj = new ObjectHolder();
            System.out.println("done");
        }
    }

    private static class ObjectHolder {
    }

    public static void main(String[] args) {
        Test test = new StaticObjTest.Test();
        test.foo();
    }
}
