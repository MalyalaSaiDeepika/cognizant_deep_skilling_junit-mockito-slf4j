package com.cognizant;

import org.junit.Test;
import static org.junit.Assert.*;

public class EvenCheckerTest {

    @Test
    public void testEven() {
        EvenChecker obj = new EvenChecker();
        assertTrue(obj.isEven(4));
    }
}