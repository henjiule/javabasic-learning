package com.congzhang.java.README.week13.io;

import java.io.File;

/**
 * @ClassName Example12_2
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/30
 **/
public class Example12_2 {
    public static void main(String[] args) {
        File dir = new File(".");
        FileAccept fileAccept = new FileAccept();
        fileAccept.setExtendName("java");
        String fileName[] = dir.list(fileAccept);
        for(String name:fileName) {
            System.out.println(name);

        }
    }
}
