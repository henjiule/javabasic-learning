package com.congzhang.java.README.Week3;

/**
 * @ClassName Test
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/10/18
 **/
public class Test {
    public static void main(String args[]) {
        CPU cpu = new CPU();
        HardDisk HD=new HardDisk();
        cpu.setSpeed(2200);
        HD.setAmount(200);
        PC pc = new PC();
        pc.setCPU(cpu);
        pc.setHardDisk(HD);
        pc.show();
    }
}
