package com.hypocrite30.chapter1.package02.Loading;

import java.io.FileNotFoundException;

/**
 * @Description: 用户自定义类加载器
 * @Author: Hypocrite30
 * @Date: 2021/6/3 12:28
 */
public class CustomClassLoader extends ClassLoader {
    /**
     * 需要重写findClass方法，并配合defineClass方法使用
     * 如果没有过于复杂的需求，可以直接继承URLClassLoader类，这样就可以避免自己去编写findClass()方法及获取字节码流的方式，
     * 使自定义类加载器编写更加简洁。
     */
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            byte[] result = getClassFromCustomPath(name);
            if (result == null) {
                throw new FileNotFoundException();
            } else {
                return defineClass(name, result, 0, result.length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        throw new ClassNotFoundException(name);
    }

    private byte[] getClassFromCustomPath(String name) {
        //从自定义路径中加载指定类:细节略
        //如果指定路径的字节码文件进行了加密，则需要在此方法中进行解密操作。
        return null;
    }

    public static void main(String[] args) {
        CustomClassLoader customClassLoader = new CustomClassLoader();
        try {
            Class<?> clazz = Class.forName("One", true, customClassLoader);
            Object obj = clazz.newInstance();
            System.out.println(obj.getClass().getClassLoader());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
