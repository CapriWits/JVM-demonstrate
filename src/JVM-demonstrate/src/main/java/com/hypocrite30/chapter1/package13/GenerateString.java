package com.hypocrite30.chapter1.package13;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Description: 产生10万行长度不超过10的字符串，包含a-z,A-Z
 * @Author: Hypocrite30
 * @Date: 2021/6/17 16:13
 */
public class GenerateString {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("words.txt");
        for (int i = 0; i < 100000; i++) {
            //1 - 10
            int length = (int) (Math.random() * (10 - 1 + 1) + 1);
            fw.write(getString(length) + "\n");
        }
        fw.close();
    }

    public static String getString(int length) {
        String str = "";
        for (int i = 0; i < length; i++) {
            //65 - 90, 97-122
            int num = (int) (Math.random() * (90 - 65 + 1) + 65) + (int) (Math.random() * 2) * 32;
            str += (char) num;
        }
        return str;
    }
}
