package Junit;

import Junit.Interfaces.AdditionAndMultiplicationInterface;
import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * created by Andrei_Korotkov 8/19/2019
 */
public class Addition {

    @Category(AdditionAndMultiplicationInterface.class)
    @Test
    public void checkAdditionDoubles() {
        Calculator calc = new Calculator();
        double result = calc.sum(2.3, 2.7);
        Assert.assertEquals(5, result, 0.0);
    }

    @Category(AdditionAndMultiplicationInterface.class)
    @Test
    public void checkAdditionLongs() {
        Calculator calc = new Calculator();
        long result = calc.sum(1000000, 1000000);
        Assert.assertEquals(2000000, result);
    }
}
