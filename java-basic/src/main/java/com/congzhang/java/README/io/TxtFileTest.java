package com.congzhang.java.README.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

/**
 * @ClassName TxtFileTest
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/30
 **/
public class TxtFileTest {
    public static void main(String[] args) throws IOException {
        //将键盘输入的一串文本保存到文件中
        //方法1：使用FileWriter结合字符数组写入（追加方式）
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        String s = scanner.nextLine();
        char [] chars = s.toCharArray();
        File file = new File("C:\\Users\\zhangcong\\Desktop\\txtFile.txt");
        Writer out = new FileWriter(file,true);
        out.write(chars);
        out.close();

    }
}
