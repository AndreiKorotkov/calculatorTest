package Junit;

import Junit.Interfaces.DivisionAndSubscriptionInterface;
import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * created by Andrei_Korotkov 8/19/2019
 */
public class Division {
    @Category(DivisionAndSubscriptionInterface.class)
    @Test(expected = NumberFormatException.class)
    public void checkDivision() {
        Calculator calc = new Calculator();
        long result = calc.div(4, 0);
        Assert.assertEquals(4, result);
    }
}
