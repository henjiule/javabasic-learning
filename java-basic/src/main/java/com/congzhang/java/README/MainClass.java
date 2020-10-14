package com.congzhang.java.README;

import com.congzhang.java.README.Week1.Circle;
import com.congzhang.java.README.Week1.Rectangle;

public class MainClass {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle.printArea(100);
        Rectangle rect = new Rectangle();
        rect.printArea(100,65);
    }
}
