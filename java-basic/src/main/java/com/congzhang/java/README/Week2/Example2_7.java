package com.congzhang.java.README.Week2;

/**
 * @ClassName Example2_7
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/10/18
 **/
import java.util.*;
public class Example2_7 {
    public static void main(String args[]) {
        int [] a={12,34,9,23,45,6,45,90,123,19,34};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int number=45;
        int index=Arrays.binarySearch(a,number);
        if(index>=0){
            System.out.println(number+"和素组中索引为Ϊ"+index+"的元数值相同");
        }
        else{
            System.out.println(number+"不与数组中的任何元素值相同");
        }
    }
}
