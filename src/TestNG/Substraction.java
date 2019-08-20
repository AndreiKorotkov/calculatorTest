package TestNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * created by Andrei_Korotkov 8/20/2019
 */

public class Substraction {
    @Test (priority = 3, groups = {"additionAndSubstraction"})
    public void checkSub () {
        Calculator calc = new Calculator();
        double result = calc.sub(0, 0.01);
        Assert.assertEquals(-0.01, result);
    }

    @Parameters ("valueFromXML")
    @Test (priority = 3, groups = {"newGroup"})
    public void parametrizedSubstraction (long valueFromXML) {
        Calculator calc = new Calculator();
        long result = calc.sub(valueFromXML, 5);
        Assert.assertEquals(5, result);
    }
}
