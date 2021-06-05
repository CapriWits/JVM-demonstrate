package com.hypocrite30.chapter1.package05;

/**
 * @Description: 虚方法表的举例
 * @Author: Hypocrite30
 * @Date: 2021/6/5 20:16
 */
interface Friendly {
    void sayHello();

    void sayGoodbye();
}

class Dog1 {
    public void sayHello() {
    }

    public String toString() {
        return "Dog";
    }
}

class Cat1 implements Friendly {
    public void eat() {
    }

    public void sayHello() {
    }

    public void sayGoodbye() {
    }

    protected void finalize() {
    }

    public String toString() {
        return "Cat";
    }
}

class CockerSpaniel extends Dog1 implements Friendly {
    public void sayHello() {
        super.sayHello();
    }

    public void sayGoodbye() {
    }
}

public class VirtualMethodTable {
}
