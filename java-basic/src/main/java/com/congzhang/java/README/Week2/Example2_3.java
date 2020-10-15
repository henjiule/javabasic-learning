package com.congzhang.java.README.Week2;

/**
 * @ClassName Example2_3
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/10/15
 **/
import java.util.Scanner;
public class Example2_3 {
    public static void main (String args[ ]){
        System.out.println("用空格（或回车）做分隔，输入若干个数，最后输入#结束,\n然后回车确定.");
        Scanner reader=new Scanner(System.in);
        double sum=0;
        int m=0;
        while(reader.hasNextDouble()){
            double x = reader.nextDouble();
            m=m+1;
            sum=sum+x;
        }
        System.out.println(m+"�����ĺ�Ϊ"+sum);
        System.out.println(m+"������ƽ��ֵ"+sum/m);
    }
}