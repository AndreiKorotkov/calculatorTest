package TestNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
/**
 * created by Andrei_Korotkov 8/20/2019
 */
public class Addition {
    @Test (priority = 0, groups = {"additionAndSubstraction"})
    public void checkAdditionDoubles () {

        Calculator calc = new Calculator();

        double result = calc.sum(2.3, 2.7);
        Assert.assertEquals((double) 5, result);
    }

    @DataProvider (name = "testIntegers")
    public Object [] [] testData () {
        return new Object [] [] {
            {26, 15, 41},
            {10, -10, 0}
        };
    }

    @Test (dataProvider = "testIntegers")
    public void checkTestData (int a, int b, int c) {
        Calculator calc = new Calculator();
        long result = calc.sum(a, b);
        Assert.assertEquals(c, result);
    }
}
