
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
    static Calculator calculator;
    @BeforeClass
    public static void generateCalculator(){
        CalculatorTest.calculator = new Calculator();
    }

    @Before
    public void doSomething(){
        System.out.println("tekst");

    }

    @Test
    public void testSum(){
        //Calculator calculator = new Calculator();
        int a=5;
        int b =3;
        int expectedResult =8;

        int result = CalculatorTest.calculator.sum(a,b);
        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void testSubtrack() {
        //  Calculator calculator = new Calculator();
        int a=5;
        int b =3;
        int expectedResult =2;
        Assert.assertEquals(2, CalculatorTest.calculator.substract(a,b));
    }
    @Test(expected = ArithmeticException.class)
    public void testDivideByZero(){
        int a=5;
        int b=0;
        CalculatorTest.calculator.divide(a,b);
    }

}
