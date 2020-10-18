package com.congzhang.java.README.Week2;

/**
 * @ClassName Example2_8
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/10/18
 **/
import java.util.Scanner;
enum Season {
   春季,夏季,秋季,冬季
}
public class Example2_8{
    public static void main(String args[]){
        Season x = null ;
        Scanner reader=new Scanner(System.in);
        int n = reader.nextInt();
        if(n == 1)
            x = Season.春季;
        else if(n == 2)
            x = Season.夏季;
        else if(n == 3)
            x = Season.秋季;
        else if(n == 4)
            x = Season.冬季;
        System.out.println("������"+x);
    }
}