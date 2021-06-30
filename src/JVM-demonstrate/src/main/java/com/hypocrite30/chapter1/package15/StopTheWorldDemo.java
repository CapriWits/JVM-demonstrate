package com.hypocrite30.chapter1.package15;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: STW测试
 * @Author: Hypocrite30
 * @Date: 2021/6/30 19:54
 */
public class StopTheWorldDemo {
    /**
     * STW测试，用 System.gc() 模拟，会出现“卡顿的现象”
     */
    public static class WorkThread extends Thread {
        List<byte[]> list = new ArrayList<byte[]>();
        @Override
        public void run() {
            try {
                while (true) {
                    for (int i = 0; i < 1000; i++) {
                        byte[] buffer = new byte[1024];
                        list.add(buffer);
                    }
                    if (list.size() > 10000) {
                        list.clear();
                        System.gc();  // 会触发full gc，进而会出现STW事件
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    /**
     * 线程一直睡一秒钟，时间间隔规律
     */
    public static class PrintThread extends Thread {
        public final long startTime = System.currentTimeMillis();

        public void run() {
            try {
                while (true) {
                    // 每秒打印时间信息
                    long t = System.currentTimeMillis() - startTime;
                    System.out.println(t / 1000 + "." + t % 1000);
                    Thread.sleep(1000);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        WorkThread w = new WorkThread();
        PrintThread p = new PrintThread();
        w.start();
        p.start();
    }
}
