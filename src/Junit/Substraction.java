package Junit;

import Junit.Interfaces.DivisionAndSubscriptionInterface;
import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * created by Andrei_Korotkov 8/19/2019
 */
public class Substraction {

    @Category({DivisionAndSubscriptionInterface.class})
    @Test
    public void checkSub () {
        Calculator calc = new Calculator();
        long result = calc.sub(5, 7);
        Assert.assertEquals(-2, result);
    }
}
