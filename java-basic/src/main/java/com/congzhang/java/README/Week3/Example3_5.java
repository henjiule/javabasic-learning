package com.congzhang.java.README.Week3;

/**
 * @ClassName Example3_5
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/10/20
 **/
public class Example3_5 {
    public static void main(String args[]) {
        long sum = 0;
        int a = 8;
        long item = a;
        int n = 12;
        for(int i = 1;i<=n; i++) {
            sum=sum+item;
            item = item*10 + a;
        }
        System.out.println(sum);
    }
}

