package com.cognizant;

import org.junit.Test;

public class PerformanceTesterTest {

    @Test(timeout = 2000)
    public void testPerformance() {
        PerformanceTester obj = new PerformanceTester();
        obj.performTask();
    }
}