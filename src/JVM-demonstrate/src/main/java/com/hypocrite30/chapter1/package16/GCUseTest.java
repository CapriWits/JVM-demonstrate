package com.hypocrite30.chapter1.package16;

import java.util.ArrayList;

/**
 * VM args: -XX:+PrintCommandLineFlags
 * <p>
 * -XX:+UseSerialGC:表明新生代使用Serial GC ，同时老年代使用Serial Old GC
 * <p>
 * -XX:+UseParNewGC：标明新生代使用ParNew GC
 * <p>
 * JDK8默认使用的GC：
 * -XX:+UseParallelGC:表明新生代使用Parallel GC
 * -XX:+UseParallelOldGC : 表明老年代使用 Parallel Old GC
 * 说明：二者可以相互激活
 * <p>
 * JDK9默认GC：
 * -XX:+UseG1GC
 * <p>
 * -XX:+UseConcMarkSweepGC：表明老年代使用CMS GC。同时，年轻代会触发对ParNew 的使用
 * @Description: 如何知道使用了哪款 GC
 * @Author: Hypocrite30
 * @Date: 2021/7/3 11:33
 */
public class GCUseTest {
    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<>();

        while (true) {
            byte[] arr = new byte[100];
            list.add(arr);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
