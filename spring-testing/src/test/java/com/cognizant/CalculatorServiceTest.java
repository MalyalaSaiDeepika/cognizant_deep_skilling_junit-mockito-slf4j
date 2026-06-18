package com.cognizant;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = SpringTestingExercisesApplication.class)
public class CalculatorServiceTest {

    @Test
    void testAdd() {
        CalculatorService cs = new CalculatorService();
        assertEquals(5, cs.add(2, 3));
    }
}