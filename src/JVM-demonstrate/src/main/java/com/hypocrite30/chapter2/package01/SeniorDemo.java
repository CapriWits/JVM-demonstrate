package com.hypocrite30.chapter2.package01;

/**
 * @Author: Hypocrite30
 * @Date: 2021/7/8 15:52
 */
public class SeniorDemo {
    private int num = 1;
    public final String info = "hypocrite30";
    boolean[] counts;

    public SeniorDemo(){

    }
    public SeniorDemo(int count){
        this.counts = new boolean[count];
    }

    public String getInfo(){
        return info;
    }
    public void addNum(int n){
        num += n;
        System.out.println(num);
    }
}
