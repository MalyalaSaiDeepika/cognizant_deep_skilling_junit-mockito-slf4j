package com.cognizant;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class EvenParameterizedTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8})
    void testEven(int num) {
        assertTrue(num % 2 == 0);
    }
}