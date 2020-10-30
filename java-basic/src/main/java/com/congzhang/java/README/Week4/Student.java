package com.congzhang.java.README.Week4;


/**
 * @ClassName Student
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/10/30
 **/

public class Student{
    int number;
    Student(int n){
        number=n;
    }
    void speak(){
        System.out.println("Student类的包名是tom.jiafei,我的学号"+number);
    }
}
