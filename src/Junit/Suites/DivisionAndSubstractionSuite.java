package Junit.Suites;

import Junit.Division;
import Junit.Substraction;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * created by Andrei_Korotkov 8/19/2019
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({Division.class, Substraction.class})
public class DivisionAndSubstractionSuite {

}
