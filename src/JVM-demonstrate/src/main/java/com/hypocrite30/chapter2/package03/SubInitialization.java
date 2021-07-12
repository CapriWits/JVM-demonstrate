package com.hypocrite30.chapter2.package03;

/**
 * @Description:
 * @Author: Hypocrite30
 * @Date: 2021/7/12 10:21
 */
public class SubInitialization extends InitializationTest {
    static {
        number = 4;  // number属性必须提前已经加载：一定会先加载父类。
        System.out.println("son static{}");
    }

    public static void main(String[] args) {
        System.out.println(number);
    }
}
