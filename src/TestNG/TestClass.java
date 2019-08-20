package TestNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * created by Andrei_Korotkov 8/20/2019
 */

public class TestClass {
    private double square;
    private double root;

    public TestClass(double number, double number2) {
        square = number;
        root = number2;
    }

    @Test
    public void testFactory() {
        Calculator calculator = new Calculator();
        double result = calculator.sqrt(square);
        Assert.assertEquals(root, result);
    }
}
