package Junit;

import Junit.Interfaces.AdditionAndMultiplicationInterface;
import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * created by Andrei_Korotkov 8/19/2019
 */
public class Multiplication {

    @Category(AdditionAndMultiplicationInterface.class)
    @Test
    public void checkMultiplication () {
        Calculator calc = new Calculator();
        long result = calc.mult(5, 5);
        Assert.assertEquals(25, result);
    }

}
