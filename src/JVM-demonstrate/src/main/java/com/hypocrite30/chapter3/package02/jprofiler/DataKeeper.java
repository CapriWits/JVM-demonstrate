package com.hypocrite30.chapter3.package02.jprofiler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @Author: Hypocrite30
 * @Date: 2021/7/14 22:37
 */
public class DataKeeper {
    private int a;
    private double b;
    private String abc = "aaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    private BigInteger bigInteger = new BigInteger("11111111111111111111");
    private int a1;
    private double b1;
    private String abc1 = "ccccccccccccccccccccccccccccc";
    private BigInteger bigInteger1 = new BigInteger("3232342222222222");

    public static List list = new ArrayList();

    public static void main(String[] args) {
        while (true) {
            for (int i = 0; i < 100; i++) {
                list.add(new DataKeeper());
            }
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
