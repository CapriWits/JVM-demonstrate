package com.hypocrite30.chapter3.package02.memoryleak;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Description: 模拟内存泄漏
 * @Author: Hypocrite30
 * @Date: 2021/7/14 22:44
 */
public class MemoryLeak {
    static List list = new ArrayList();

    public void oomTests() {
        Object obj = new Object();
        list.add(obj);
    }

}