package com.hypocrite30.chapter2.package04;

import java.lang.reflect.Method;

/**
 * @Description:
 * @Author: Hypocrite30
 * @Date: 2021/7/13 10:49
 */
public class LoopRun {
    public static void main(String args[]) {
        while (true) {
            try {
                // 1. 创建自定义类加载器的实例
                MyClassLoader loader = new MyClassLoader("C:\\Users\\10270\\Desktop\\java\\javaEEworkplace\\JVM-demonstrate\\src\\main\\java");
                // 2. 加载指定的类
                Class clazz = loader.findClass("com.hypocrite30.chapter2.package04.Demo1");
                // 3. 创建运行时类的实例
                Object demo = clazz.newInstance();
                // 4. 获取运行时类中指定的方法
                Method m = clazz.getMethod("hot");
                // 5. 调用指定的方法
                m.invoke(demo);
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println("not find");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
