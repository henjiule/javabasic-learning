package com.congzhang.java.README.Week3;

/**
 * @ClassName Example3_10
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/10/21
 **/
enum Fruit {
    苹果,梨,香蕉,西瓜,芒果
}
public class Example3_10 {
    public static void main(String args[]) {
        double price=0;
        boolean show=false;
        for(Fruit fruit:Fruit.values()) {
            switch(fruit) {
                case 苹果: price=1.5;
                    show=true;
                    break;
                case 芒果: price=6.8;
                    show=true;
                    break;
                case 香蕉: price=2.8;
                    show=true;
                    break;
                default:   show=false;
            }
            if(show) {
                System.out.println(fruit+"500的价格"+price+"元");
            }
        }
    }
}