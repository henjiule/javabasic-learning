package com.congzhang.java.README.Week4;

/**
 * @ClassName Circle
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/10/28
 **/
public class Circle {
    double x,y,radius;
    public void setX(double a) {
        x=a;
    }
    public double getX() {
        return x;
    }
    public void setY(double b){
        y=b;
    }
    public double getY() {
        return y;
    }
    public void setRadius(double r){
        if(r >0 )
            radius=r;
    }
    public double getRadius(){
        return radius;
    }
}