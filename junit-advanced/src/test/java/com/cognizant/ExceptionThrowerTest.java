package com.cognizant;

import org.junit.Test;

public class ExceptionThrowerTest {

    @Test(expected = IllegalArgumentException.class)
    public void testThrowException() {
        ExceptionThrower obj = new ExceptionThrower();
        obj.throwException();
    }
}