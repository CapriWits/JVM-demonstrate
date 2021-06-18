package com.hypocrite30.chapter1.package13;

import java.util.HashSet;
import java.util.Set;

/**
 * jdk6中：
 * -XX:PermSize=6m -XX:MaxPermSize=6m -Xms6m -Xmx6m
 * <p>
 * jdk8中：
 * -XX:MetaspaceSize=10m -XX:MaxMetaspaceSize=10m -Xms10m -Xmx10m
 * @Description: 验证jdk6之前StringTable在永久代，jdk7挪到堆内
 * @Author: Hypocrite30
 * @Date: 2021/6/17 17:36
 */
public class StringTest3 {
    public static void main(String[] args) {
        // 使用Set保存着常量池引用，避免full gc回收常量池行为
        Set<String> set = new HashSet<String>();
        // 在short可以取值的范围内足以让6MB的PermSize或heap产生OOM了。
        int i = 0;
        while (true) {
            set.add(String.valueOf(i++).intern());
        }
    }
}
