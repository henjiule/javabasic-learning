package com.congzhang.java.README.Week3;

/**
 * @ClassName AAA
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/10/18
 **/
class AAA{
    static int m;
    static {
        m = 888;
    }
}
class E {
    public static void main(String[] args) {
        AAA a = null;
        System.out.printf("%d:%d",AAA.m,a.m);
    }
}