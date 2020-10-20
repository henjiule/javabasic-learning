package com.congzhang.java.README.Week3;

/**
 * @ClassName Example3_6
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/10/20
 **/
public class Example3_6 {
    public static void main(String args[]) {
        double sum=0,item=1;
        int i=1,n=20;
        while(i<=n) {
            sum=sum+item;
            i=i+1;
            item=item*(1.0/i);
        }
        System.out.println("sum="+sum);
    }
}

