package com.hypocrite30.chapter1.package05;

/**
 * invokestatic指令和invokespecial指令调用的方法称为非虚方法
 * @Description: 解析调用中非虚方法、虚方法的测试
 * @Author: Hypocrite30
 * @Date: 2021/6/5 12:39
 */
class Father {
    public Father() {
        System.out.println("father的构造器");
    }

    public static void showStatic(String str) {
        System.out.println("father " + str);
    }

    public final void showFinal() {
        System.out.println("father show final");
    }

    public void showCommon() {
        System.out.println("father 普通方法");
    }
}

public class Son extends Father {
    public Son() {
        //invokespecial
        super();
    }

    public Son(int age) {
        //invokespecial
        this();
    }

    //不是重写的父类的静态方法，因为静态方法不能被重写！
    public static void showStatic(String str) {
        System.out.println("son " + str);
    }

    private void showPrivate(String str) {
        System.out.println("son private" + str);
    }

    public void show() {
        //invokestatic
        showStatic("hypocrite30.com");
        //invokestatic
        super.showStatic("good!");
        //invokespecial
        showPrivate("hello!");
        //invokespecial
        super.showCommon();

        //invokevirtual
        //加上super.显示调用，则是invokespecial，本质上也是确定的。
        showFinal();//因为此方法声明有final，不能被子类重写，所以也认为此方法是非虚方法。

        //虚方法如下：
        //invokevirtual
        showCommon();
        info();

        MethodInterface in = null;
        //invokeinterface
        in.methodA(); // 最终调用还是要看接口的实现类重写的方法，无法确定，虚方法。
    }

    public void info() {

    }

    public void display(Father f) {
        f.showCommon();
    }

    public static void main(String[] args) {
        Son so = new Son();
        so.show();
    }
}

interface MethodInterface {
    void methodA();
}
