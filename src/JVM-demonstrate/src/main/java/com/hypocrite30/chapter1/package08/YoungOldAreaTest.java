package com.hypocrite30.chapter1.package08;

/**
 * -Xms60m -Xmx60m -XX:NewRatio=2 -XX:SurvivorRatio=8 -XX:+PrintGCDetails
 * Eden : 16m ;    Survivor0 : 2m ;    Survivor1 : 2m ;    Old : 40m
 * @Description: 大对象直接进入老年代
 * @Author: Hypocrite30
 * @Date: 2021/6/8 11:09
 */
public class YoungOldAreaTest {
    public static void main(String[] args) {
        byte[] buffer = new byte[1024 * 1024 * 20];  // 20m
    }
}
