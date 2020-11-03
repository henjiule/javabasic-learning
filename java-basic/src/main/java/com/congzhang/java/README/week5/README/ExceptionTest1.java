package com.congzhang.java.README.week5.README;

import java.util.Scanner;

/**
 * @ClassName ExceptionTest1
 * @Description 运行时的异常练习
 * @Author zhangcong
 * @Date 2020/11/2
 **/
public class ExceptionTest1 {
    public static void main(String[] args) {
//        //1.ArithmeticException 算术异常
//        int result;
//        try {
//            result = 3 / 0 ;
//        } catch (ArithmeticException e) {
//           // JOptionPane.showMessageDialog(null,"除数不能为0！");
//            System.err.println("除数不能为0！");
//            System.err.println(e.getMessage());
//
//           // e.printStackTrace();
//        }
//
//        System.out.println(result);
//    }


//       //  2.  ArrayIndexOutOfBoundsException  数组索引越界异常
//        int[] a = new int[]{1,2,3,4,5};
//        try {
//            System.out.println(a[5]);
//        }catch (ArrayIndexOutOfBoundsException e) {
//            System.err.println("数组索引越界！！");
//            System.err.println("引起的原因" + e. getCause());
//            System.err.println("异常的详细信息" + e.getMessage());
//            System.err.println("异常对象e" + e.toString());
//        }

          // 3.   NumberFormatException  数字格式化异常
        System.out.println("请输入价格：");
        Scanner scanner = new Scanner(System.in);
        //    从键盘读入一串字符串 “123”
        String priceStr = scanner.nextLine();
        //  将自字符串转化成整形123
        int price = Integer.parseInt(priceStr);
        System.out.println("price = " + price);



        //4.  NPE NullPointerException




    }
}