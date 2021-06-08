package com.hypocrite30.chapter1.package08;

/**
 * @Description: 测试-XX:UseTLAB参数是否开启的情况: 默认情况是开启的
 * @Author: Hypocrite30
 * @Date: 2021/6/8 11:16
 */
public class TLABArgsTest {
    public static void main(String[] args) {
        System.out.println("我只是来打个酱油~");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
