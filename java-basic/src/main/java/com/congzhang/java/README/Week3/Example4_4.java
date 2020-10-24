package com.congzhang.java.README.Week3;

/**
 * @ClassName Example4_4
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/10/24
 **/
public class Example4_4 {   //主类
    public static void main(String args[]) {
        Rect rect=new Rect();
        double w=12.76,h=25.28;
        rect.setWidth(w);
        rect.setHeight(h);
        System.out.println("矩形对象的宽"+rect.getWidth()+" 高"+rect.getHeight());
        System.out.println("矩形的面积"+rect.getArea());
        System.out.println("更改向对象的方法参数传递值得w,h�变量的值为100和256");
        w=100;
        h=256;
        System.out.println("矩形对象的宽"+rect.getWidth()+" 高"+rect.getHeight());
    }
}
