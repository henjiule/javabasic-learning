package com.congzhang.java.README.week13.io;

import java.io.File;

/**
 * @ClassName FileTest
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/30
 **/
public class FileTest {
    public static void main(String[] args) {
//       //创建一个以当前时间命名的目录
//        LocalDate date = LocalDate.now();
//        String dirName = date.getYear() + "-" + date.getMonthValue() + "-" + date.getDayOfMonth();
//       File dateDir = new File("D:" + File.separator + dirName);
//        if (!dateDir.exists()){
//            boolean flag = dateDir.mkdirs();
//            System.out.println(flag);
//        }
        //课堂练习1-3：创建目录，顶级目录名：Java，一级目录名：面向对象、异常、集合、io、多线程 ， io下目录：字符流、字节流
        File grand = new File("D:/Java");
        if (!grand.exists()) {
            System.out.println(grand.mkdirs());
            File parent = new File("D:/Java/io");
            File parent1 = new File("D:/Java/面向对象");
            File parent2 = new File("D:/Java/异常");
            File parent3 = new File("D:/Java/集合");
            File parent4 = new File("D:/Java/多线程");
            parent1.mkdirs();
            parent2.mkdirs();
            parent3.mkdirs();
            parent4.mkdirs();
            if (!parent.exists()) {
                System.out.println(parent.mkdirs());
                File child1 = new File("D:/Java/io/字节流");
                File child2 = new File("D:/Java/io/字符流");
                if (!child1.exists()) {
                    System.out.println(child1.mkdirs());
                }
                if (!child2.exists()) {
                    System.out.println(child2.mkdirs());
                }
            }
        }


    }
}