package com.congzhang.java.README.week13.io;

import java.io.*;
import java.util.Scanner;
import java.util.UUID;

/**
 * @ClassName TxtFileTest
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/30
 **/
public class TxtFileTest {
    public static void main(String[] args) throws IOException {
        //将键盘输入的一串文本保存到文件中
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();

        String fileName = UUID.randomUUID().toString();
        //Writer写入文件
        File file = new File("D:/" + fileName + ".txt");
        Writer out = new FileWriter(file,true);
        out.write(chars);
        out.close();
        //FileOutputStream写入文件
        FileOutputStream outputStream = new FileOutputStream(file);
        outputStream.write(s.getBytes());
        outputStream.flush();
        outputStream.close();
        //BufferedWriter写入文件
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(chars);
        bw.close();
        //打印流
        PrintStream ps = null ;
        ps = new PrintStream(new FileOutputStream(new File(String.valueOf(file)))) ;
        ps.print(chars) ;
        ps.close() ;







    }
}
