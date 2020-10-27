package com.congzhang.java.README.Week4;

/**
 * @ClassName Computer
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/10/27
 **/
public class Computer {
    public double getResult(double a,int ... x) { //x是可变参数的参数代表
        double result=0;
        int sum=0;
        for(int i=0;i<x.length;i++) {
            sum=sum+x[i];
        }
        result=a*sum;
        return result;
    }
}