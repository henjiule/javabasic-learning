package com.congzhang.java.README.week14;

import java.awt.*;
import java.util.Random;

/**
 * @ClassName LineThread
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/12/7
 **/
public class LineThread implements Runnable {
    private int x = 100;
    private int y = 300;

    private Frame frame;

    private Color[] colors = {Color.darkGray,Color.CYAN,Color.black,Color.BLUE, Color.PINK, Color.orange,Color.cyan};

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //得到传入的窗体对象(2d)画笔
            Graphics g = this.frame.getGraphics();
            Random random = new Random();
            //得到颜色数组的随机下标
            int index = random.nextInt(colors.length);
            //设置画笔的颜色
            g.setColor(colors[index]);
            g.drawLine(x,y,600,400);
            x += 50;
            y += 30;
            if (x >= 1000) {
                break;
            }
        }
    }
}
