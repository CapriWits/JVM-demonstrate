package com.hypocrite30.chapter1.package15;

/**
 * @Description: 强引用的测试
 * @Author: Hypocrite30
 * @Date: 2021/7/2 12:41
 */
public class StrongReferenceTest {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello");
        StringBuffer str1 = str;
        str = null; // 只有一个引用置空，但str1仍然是强引用，gc不掉
        System.gc();
        // 延迟3秒，确定gc能实现
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(str1);
    }
}