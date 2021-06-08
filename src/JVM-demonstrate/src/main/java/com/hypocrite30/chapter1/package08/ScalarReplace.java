package com.hypocrite30.chapter1.package08;

/**
 * -XX:+/-EliminateAllocations 开启关闭标量替换进行测试
 * -Xmx100m -Xms100m -XX:+DoEscapeAnalysis -XX:+PrintGC -XX:-EliminateAllocations
 * @Description: 标量替换测试
 * @Author: Hypocrite30
 * @Date: 2021/6/8 12:29
 */
public class ScalarReplace {
    public static class User {
        public int id;
        public String name;
    }

    public static void alloc() {
        User u = new User(); //未发生逃逸
        u.id = 5;
        u.name = "hypocrite30.top";
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            alloc();
        }
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为： " + (end - start) + " ms");
    }
}
