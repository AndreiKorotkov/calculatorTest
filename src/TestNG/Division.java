package TestNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * created by Andrei_Korotkov 8/20/2019
 */
public class Division {
    @Test(priority = 1, expectedExceptions = NumberFormatException.class, expectedExceptionsMessageRegExp = "Attempt to divide by zero", dependsOnGroups = {"additionAndSubstraction"})
    public void checkDivision() {
        Calculator calc = new Calculator();
        double result = calc.div(4, 0);
        Assert.assertEquals(4, result);
    }
}
