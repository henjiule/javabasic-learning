package com.congzhang.java.README.Week3;

/**
 * @ClassName Circular
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/10/25
 **/
public class Circular {
    Circle bottom;
    double height;
    Circular(Circle c,double h) {
        bottom = c;
        height = h;
    }
    double getVolume() {
        return bottom.getArea()*height/3.0;
    }
    double getBottomRadius() {
        return bottom.getRadius();
    }
    public void setBottomRadius(double r){
        bottom.setRadius(r);
    }
}