package com.hypocrite30.chapter1.package02.LinkingAndInitialization;

/**
 * @Description: 子类执行<clinit>()之前要先执行父类<clinit>()
 * @Author: Hypocrite30
 * @Date: 2021/6/3 11:37
 */
public class Clinit_FatherSon_Test {
    static class Father {
        public static int A = 1;

        static {
            A = 2;
        }
    }

    static class Son extends Father {
        public static int B = A;
    }

    public static void main(String[] args) {
        //加载Father类，其次加载Son类。
        System.out.println(Son.B); //2
    }
}
