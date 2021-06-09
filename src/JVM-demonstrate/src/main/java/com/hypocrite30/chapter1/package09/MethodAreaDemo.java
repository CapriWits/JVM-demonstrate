package com.hypocrite30.chapter1.package09;

/**
 * jdk7及以前：
 * -XX:PermSize=100m -XX:MaxPermSize=100m
 * <p>
 * jdk8及以后：
 * -XX:MetaspaceSize=100m  -XX:MaxMetaspaceSize=100m
 * @Description: 测试设置方法区大小参数的默认值
 * @Author: Hypocrite30
 * @Date: 2021/6/8 22:30
 */
public class MethodAreaDemo {
    public static void main(String[] args) {
        System.out.println("start...");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("end...");
    }
}
