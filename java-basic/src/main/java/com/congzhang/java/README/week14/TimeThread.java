package com.congzhang.java.README.week14;

import lombok.SneakyThrows;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName TimeThread
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/12/7
 **/
public class TimeThread implements Runnable{
    private JLabel timeLabel;

    public void setTimeLabel(JLabel timeLabel) {
        this.timeLabel = timeLabel;
    }

    @SneakyThrows
    @Override
    public void run() {
        while (true) {
            Calendar cale = Calendar.getInstance();
            // 将 Calendar 类型转换成 Date 类型
            Date tasktime = cale.getTime();
            // 设置日期输出的格式
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            timeLabel.setText(LocalDateTime.now().toString());
            timeLabel.setText(df.format(tasktime));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}