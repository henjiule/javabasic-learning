package com.congzhang.java.README.week14;

import javax.swing.*;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @ClassName CarouselThread
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/12/7
 **/
public class CarouselThread implements Runnable {
    private String[] imgs = {
            " https://cong-zhang.oss-cn-beijing.aliyuncs.com/img/a.jpg",
            "https://cong-zhang.oss-cn-beijing.aliyuncs.com/img/b.jpg",
            "https://cong-zhang.oss-cn-beijing.aliyuncs.com/img/c.jpg",
            "https://cong-zhang.oss-cn-beijing.aliyuncs.com/img/d.jpg",

    };

    //创建显示图片的组件
    private JLabel bgLabel;

    public void setBgLabel(JLabel bgLabel) {
        this.bgLabel = bgLabel;
    }

    @Override
    public void run() {
        int index = 0;
        int len = imgs.length;

        while (true) {
            try {
                URL url = new URL(imgs[index]);
                //创建了连接
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.setConnectTimeout(10000);
                //得到连接目标的输入流
                InputStream is = conn.getInputStream();
                //字节缓冲输出流
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                //缓冲区
                byte[] buffer = new byte[1024];
                int lenth = 0;
                //通过缓冲区读取文件
                while ((lenth = is.read(buffer)) != -1) {
                    baos.write(buffer, 0, lenth);
                }
                byte[] bytes = baos.toByteArray();
                //将字节数组通过字节输入流读入
                is.read(bytes);
                //通过bytes构建图标icon
                Icon icon = new ImageIcon(bytes);
                //将icon设置为背景标签的图标
                this.bgLabel.setIcon(icon);
                Thread.sleep(2000);
                is.close();

            } catch (Exception e) {
                e.printStackTrace();
            }

            index++;
            //处理数组最后一个元素
            if (index == len) {
                index = 0;
            }
        }


    }
}
