package se.Iths;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {


    @BeforeAll
    @DisplayName("Testing if a Calculator object was created")
    public static void testCreateCalculator() {
        Calculator cal = new Calculator();
        assertNotNull(cal);
        System.out.println("Calculator creation attempt was successful");

    }

    @RepeatedTest(15)
    public void testAdd() {
        Calculator cal = new Calculator();
        assertEquals(20, cal.Add(10, 10));
    }

    @Test
    public void testSub() {
        Calculator cal = new Calculator();
        assertNotEquals(25, cal.Sub(30, 10));


    }

    @Test
    public void testMultiplication() {
        Calculator cal = new Calculator();
        int sum1 = cal.Multiplication(20, 100);
        int sum2 = cal.Multiplication(300, 500);
        System.out.println("Sum1 = : " + sum1 + " Sum2 = : " + sum2);
        assertTrue(sum1 < sum2);


    }

    @Disabled
    public void testDivision() {

        Calculator cal = new Calculator();
        assertEquals(3, cal.Division(27, 9));


    }

    @AfterAll
    public static void endTestMessage() {
        System.out.println("Tests done");
    }


}
