package Junit.Suites;

import Junit.Addition;
import Junit.Interfaces.AdditionAndMultiplicationInterface;
import Junit.Multiplication;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * created by Andrei_Korotkov 8/19/2019
 */

@Suite.SuiteClasses({Addition.class, Multiplication.class})
@Category(AdditionAndMultiplicationInterface.class)
@RunWith(Categories.class)
public class AdditionAndMultiplication {
}
