package com.hypocrite30.chapter2.package02;

/**
 * @Description: 指令6：操作数栈管理指令
 * @Author: Hypocrite30
 * @Date: 2021/7/10 11:57
 */
public class StackOperateTest {

    public void print() {
        Object obj = new Object();
//        String info = obj.toString();
        obj.toString();
    }

    // 类似的
    public void foo() {
        bar();
    }

    public long bar() {
        return 0;
    }

    public long nextIndex() {
        return index++;
    }

    private long index = 0;
}
