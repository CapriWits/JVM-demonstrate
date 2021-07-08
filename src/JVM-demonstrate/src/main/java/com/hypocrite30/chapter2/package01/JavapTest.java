package com.hypocrite30.chapter2.package01;

/**
 * @Description: javac -g 会生成带局部变量表的字节码文件
 * @Author: Hypocrite30
 * @Date: 2021/7/8 15:54
 */
public class JavapTest {
    private int num;
    boolean flag;
    protected char gender;
    public String info;

    public static final int COUNTS = 1;

    static {
        String url = "hypocrite30.top";
    }

    {
        info = "java";
    }

    public JavapTest() {

    }

    private JavapTest(boolean flag) {
        this.flag = flag;
    }

    private void methodPrivate() {

    }

    int getNum(int i) {
        return num + i;
    }

    protected char showGender() {
        return gender;
    }

    public void showInfo() {
        int i = 10;
        System.out.println(info + i);
    }
}
