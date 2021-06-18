package com.hypocrite30.chapter1.package11;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * VM args: -Xmx20m -XX:MaxDirectMemorySize=10m
 * @Description: 绕过DirectByteBuffer，直接分配本地内存，使用到Unsafe类
 * @Author: Hypocrite30
 * @Date: 2021/6/16 11:48
 */
public class MaxDirectMemorySizeTest {
    private static final long _1MB = 1024 * 1024;

    public static void main(String[] args) throws IllegalAccessException {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        while (true) {
            unsafe.allocateMemory(_1MB);
        }
    }
}
