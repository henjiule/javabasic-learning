package com.congzhang.java.README.Week3;

/**
 * @ClassName Circle
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/10/25
 **/
public class Circle {
    double radius;
    Circle(double r) {
        radius=r;
    }
    double getArea() {
        return 3.14*radius*radius;
    }
    void setRadius(double r) {
        radius=r;
    }
    double getRadius() {
        return radius;
    }
}