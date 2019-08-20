package TestNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * created by Andrei_Korotkov 8/20/2019
 */
public class Multiplication {
    @Test(priority = 0, dependsOnGroups = {"additionAndSubstraction"})
    public void checkMultiplicationLong() {
        Calculator calc = new Calculator();
        long result = calc.mult(5, 5);
        Assert.assertEquals(result, 25);
    }

    @Test(priority = 0, dependsOnMethods = {"checkMultiplicationLong"})
    public void CheckMultiplicationDoubles() {
        Calculator calculator = new Calculator();
        double result = calculator.mult(1.01, 1.0);
        Assert.assertEquals(result, 1.01, 0.1);
    }
}


