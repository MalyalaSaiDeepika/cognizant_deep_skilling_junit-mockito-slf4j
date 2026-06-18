import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AAAExampleTest {

    private Calculator calculator;

    // SETUP (Before each test)
    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup executed");
    }

    // TEST using AAA pattern
    @Test
    public void testAddition() {

        // ARRANGE
        int a = 10;
        int b = 5;

        // ACT
        int result = calculator.add(a, b);

        // ASSERT
        assertEquals(15, result);
    }

    @Test
    public void testSubtraction() {

        // ARRANGE
        int a = 10;
        int b = 5;

        // ACT
        int result = calculator.subtract(a, b);

        // ASSERT
        assertEquals(5, result);
    }

    // TEARDOWN (After each test)
    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown executed");
    }
}