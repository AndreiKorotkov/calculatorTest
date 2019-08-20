package TestNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * created by Andrei_Korotkov 8/20/2019
 */
public class TestClass {
    private int dividend;
    
    
    public TestClass(int number) {
        dividend = number;
    }

    @Test
    public void testFactory() {
        Calculator calculator = new Calculator();
        long result = calculator.div(dividend, 10);
        Assert.assertEquals(dividend/10, result);
    }
}
