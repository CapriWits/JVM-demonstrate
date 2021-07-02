package com.hypocrite30.chapter1.package15;

import java.lang.ref.SoftReference;

/**
 * VM args: -Xms10m -Xmx10m
 * @Description: 软引用的测试：内存不足即回收
 * @Author: Hypocrite30
 * @Date: 2021/7/2 16:18
 */
public class SoftReferenceTest {
    public static class User {
        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int id;
        public String name;

        @Override
        public String toString() {
            return "[id=" + id + ", name=" + name + "] ";
        }
    }

    public static void main(String[] args) {
        // 创建对象，建立软引用
        // SoftReference<User> userSoftRef = new SoftReference<User>(new User(1, "wxx"));
        // 上面的一行代码，等价于如下的三行代码
        User u1 = new User(1, "hypocrite30");
        SoftReference<User> userSoftRef = new SoftReference<User>(u1);
        u1 = null;  // 取消强引用

        // 从软引用中重新获得强引用对象
        System.out.println(userSoftRef.get());

        System.gc();
        System.out.println("After GC:");
        //垃圾回收之后获得软引用中的对象
        System.out.println(userSoftRef.get());  // 由于堆空间内存足够，所有不会回收软引用的可达对象。

        try {
            // 让系统认为内存资源不够，会回收软引用
            // byte[] b = new byte[1024 * 1024 * 7];
            // 让系统认为内存资源紧张，会回收软引用
            byte[] b = new byte[1024 * 7168 - 610 * 1024]; // 算好大小，正好回收且不报OOM
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            //再次从软引用中获取数据
            System.out.println(userSoftRef.get());  // 在报OOM之前，垃圾回收器会回收软引用的可达对象。
        }
    }
}
