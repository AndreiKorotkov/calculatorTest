package Junit;

import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

/**
 * created by Andrei_Korotkov 8/19/2019
 */
@RunWith(Parameterized.class)
public class ParametrizedAdditionTest {

    long num1;
    long num2;
    long sum;

    public ParametrizedAdditionTest (long num1, long num2, long sum) {
        this.num1=num1;
        this.num2=num2;
        this.sum=sum;
    }

    @Parameterized.Parameters
    public static List<Object[]> parameters () {
        return Arrays.asList(new Object[][] {
                {0,0,0},
                {1,0,1},
                {-1,1,0}
        });
    }

    @Test
    public void ParametrizedAdditionTest () {
        Calculator calc = new Calculator();
        long result = calc.sum(num1, num2);
        Assert.assertEquals(sum, result);
    }
}
