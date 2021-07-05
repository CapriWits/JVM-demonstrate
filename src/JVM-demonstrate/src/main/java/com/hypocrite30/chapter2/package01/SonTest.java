package com.hypocrite30.chapter2.package01;

/**
 * 成员变量（非静态的）的赋值过程： ① 默认初始化 - ② 显式初始化 /代码块中初始化 - ③ 构造器中初始化 -
 * ④ 有了对象之后，可以“对象.属性”或"对象.方法"
 * 的方式对成员变量进行赋值。
 * @Description: 多态的复杂环境下，看字节码分析程序运行
 * @Author: Hypocrite30
 * @Date: 2021/7/5 22:24
 */
class Father {
    int x = 10;

    public Father() {
        this.print();
        x = 20;
    }

    public void print() {
        System.out.println("Father.x = " + x);
    }
}

class Son extends Father {
    int x = 30;

    //    float x = 30.1F;
    public Son() {
        this.print();
        x = 40;
    }

    public void print() {
        System.out.println("Son.x = " + x);
    }
}

public class SonTest {
    public static void main(String[] args) {
        Father f = new Son();
        System.out.println(f.x);
    }
}
