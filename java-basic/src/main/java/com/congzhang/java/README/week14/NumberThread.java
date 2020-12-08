package com.congzhang.java.README.week14;
import javax.swing.*;

/**
 * @ClassName NumberThread
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/12/8
 **/

/**
 * @ClassName NumberThread
 * @Description TODO
 * @Author 15696
 * @Date 2020/12/8
 **/
public class NumberThread implements Runnable {
    private JLabel numLabel;

    public void setNumLabel(JLabel numLabel){
        this.numLabel = numLabel;
    }

    private final Object lock = new Object();
    private boolean pause = false;

    void pauseThread(){
        pause = true;
    }

    void resumeThread(){
        pause = false;
        synchronized (lock){
            lock.notify();
        }
    }

    void onPause(){
        synchronized (lock){
            try {
                lock.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    @Override
    public void run() {
        int index = 0;
        while (true){
            while (pause){
                onPause();
            }
            try{
                numLabel.setText(String.valueOf(index));
                Thread.sleep(500);
                ++index;
            }catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }

}

