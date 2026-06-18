package com.cognizant;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrderedTests {

    @Test
    public void test1() {
        System.out.println("First");
    }

    @Test
    public void test2() {
        System.out.println("Second");
    }

    @Test
    public void test3() {
        System.out.println("Third");
    }
}