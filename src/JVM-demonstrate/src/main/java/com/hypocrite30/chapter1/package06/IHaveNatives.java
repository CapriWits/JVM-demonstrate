package com.hypocrite30.chapter1.package06;

/**
 * @Description: 本地方法演示
 * @Author: Hypocrite30
 * @Date: 2021/6/6 11:58
 */
public class IHaveNatives {
    /**
     * 本地方法定义类似于interface，没有方法体的原因是：方法体在本地，而并不是真正意义上的没方法体
     * 不同于abstract，所以 native 和 abstract 不能共用
     */
    public native void Native1(int x);

    public native static long Native2();

    private native synchronized float Native3(Object o);

    native void Native4(int[] ary) throws Exception;

}
