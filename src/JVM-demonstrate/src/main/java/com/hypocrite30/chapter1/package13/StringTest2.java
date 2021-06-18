package com.hypocrite30.chapter1.package13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * VM args: -XX:StringTableSize=1009
 * @Description: 用 -XX:StringTableSize 改变 String 底层的Hashtable长度
 * @Author: Hypocrite30
 * @Date: 2021/6/17 16:08
 */
public class StringTest2 {
    public static void main(String[] args) {
        // 测试StringTableSize参数
        // System.out.println("我来打个酱油");
        // try {
        //     Thread.sleep(1000000);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        BufferedReader br = null;
        try {
            // word.txt是含有10万行，每行长度1~10的txt文件
            br = new BufferedReader(new FileReader("words.txt"));
            long start = System.currentTimeMillis();
            String data;
            while ((data = br.readLine()) != null) {
                data.intern();   // 如果字符串常量池中没有对应data的字符串的话，则在常量池中生成
            }
            long end = System.currentTimeMillis();
            System.out.println("花费的时间为：" + (end - start));  // 1009:136ms  100009:49ms
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
