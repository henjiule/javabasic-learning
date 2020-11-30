package com.congzhang.java.README.io;

import java.io.File;
import java.time.LocalDate;

/**
 * @ClassName FileTest
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/30
 **/
public class FileTest {
    public static void main(String[] args) {
//        //1.创建文件
//        File file = new File("" + File.separator + "");
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.getName());
//        //2.创建文件夹（目录），如果目录不存在，就创建目录
//        File dir = new File("");
//        if (!dir.exists()) {
//            boolean flag = dir.mkdirs();
//            System.out.println(flag);
//        }
        //3.课堂练习1-1：创建目录，用当前系统日期命名,注意判断是否存在
        LocalDate today = LocalDate.now();
        String dirName = today.getYear() + "-" + today.getMonthValue() + "-" + today.getDayOfMonth();
        File dir = new File("C:\\Users\\zhangcong\\Desktop" + dirName);
        if (!dir.exists()) {
            boolean flag = dir.mkdirs();
            System.out.println(flag);
        }

        //课堂练习1-2：删除刚才创建的目录，注意判断是否存在


        //课堂练习1-3：
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
