package com.congzhang.java.README.Week4;

import org.junit.Test;

public class BaseEmployeeTest {
    @Test
    public void print() {
    }
    @Test
    public void getSalary() {
        BaseEmployee be = new MarketEmployee("admin");
        assertEquals(3000,be.getSalary());
    }

    private void assertEquals(int i, int salary) {
    }
}
