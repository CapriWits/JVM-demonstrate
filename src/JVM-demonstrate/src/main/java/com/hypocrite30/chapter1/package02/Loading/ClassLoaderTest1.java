package com.hypocrite30.chapter1.package02.Loading;

import sun.security.util.CurveDB;

import java.net.URL;
import java.security.Provider;

/**
 * @Description: 查看启动类加载器和扩展类加载器能加载的路径
 * @Author: Hypocrite30
 * @Date: 2021/6/3 12:16
 */
public class ClassLoaderTest1 {
    public static void main(String[] args) {
        System.out.println("------------启动类加载器------------");
        //获取BootstrapClassLoader能够加载的api的路径
        URL[] urLs = sun.misc.Launcher.getBootstrapClassPath().getURLs();
        for (URL element : urLs) {
            System.out.println(element.toExternalForm());
        }
        //从上面的路径中随意选择一个类,来看看他的类加载器是什么: 引导类加载器
        ClassLoader classLoader = Provider.class.getClassLoader();
        System.out.println(classLoader); // null

        System.out.println("------------扩展类加载器------------");
        String extDirs = System.getProperty("java.ext.dirs");
        for (String path : extDirs.split(";")) {
            System.out.println(path);
        }
        //从上面的路径中随意选择一个类,来看看他的类加载器是什么:扩 展类加载器
        ClassLoader classLoader1 = CurveDB.class.getClassLoader();
        System.out.println(classLoader1);
    }
}
