package com.hypocrite30.chapter1.package16;

import java.util.ArrayList;

/**
 * VM args: -Xms60m -Xmx60m -XX:SurvivorRatio=8 -XX:+PrintGCDetails -Xloggc:./logs/gc.log
 * @Description: GC 日志生成文件，起始目录在根目录
 * @Author: Hypocrite30
 * @Date: 2021/7/5 15:59
 */
public class GCLogTest {
    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<>();

        for (int i = 0; i < 500; i++) {
            byte[] arr = new byte[1024 * 100];//100KB
            list.add(arr);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
