package com.congzhang.java.README.week13.io;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @ClassName FileAccept
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/30
 **/
public class FileAccept implements FilenameFilter {
    private String extendName;
    public void setExtendName(String s) {
        extendName="."+ s;
    }
    public boolean accept(File dir, String name) {
        return name.endsWith(extendName);
    }
}
