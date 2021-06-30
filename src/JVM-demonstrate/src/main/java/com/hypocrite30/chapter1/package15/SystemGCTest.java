package com.hypocrite30.chapter1.package15;

/**
 * @Description: 测试手动gc
 * @Author: Hypocrite30
 * @Date: 2021/6/29 20:54
 */
public class SystemGCTest {
    public static void main(String[] args) {
        new SystemGCTest();
        System.gc();  // 提醒jvm的垃圾回收器执行gc,但是不确定是否马上执行gc
        // 与Runtime.getRuntime().gc();的作用一样。

        System.runFinalization();  // 强制调用失去引用的对象的finalize()方法
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("SystemGCTest 重写了finalize()");
    }
}
