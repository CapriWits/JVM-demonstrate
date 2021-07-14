package com.hypocrite30.chapter3.package02.jprofiler;

/**
 * @Description: 功能演示测试
 * @Author: Hypocrite30
 * @Date: 2021/7/14 22:38
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class JProfilerTest {
    public static void main(String[] args) {
        while (true) {
            ArrayList list = new ArrayList();
            for (int i = 0; i < 500; i++) {
                Data data = new Data();
                list.add(data);
            }
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Data {
    private int size = 10;
    private byte[] buffer = new byte[1024 * 1024];//1mb
    private String info = "hello,atguigu";
}