package TestNG;

/**
 * created by Andrei_Korotkov 8/20/2019
 */
public class FactoryClass {
    @org.testng.annotations.Factory
    public Object[] createInstances() {
        Object[] result = new Object[10];
        for (int i = 0; i < 10; i++) {
            result[i] = new TestClass(i * 10);
        }
        return result;
    }
}
