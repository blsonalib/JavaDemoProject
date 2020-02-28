import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {
    @Test
    public void givenToCheckAdditionOfTwoNumbers() {
        Calculator calculator = new Calculator();
        int resultData = calculator.addition(10,20);
        Assert.assertEquals(30,resultData);
    }

    @Test
    public void givenToCheckSubstractionOfTwoNumbers() {
        Calculator calculator = new Calculator();
        int resultData = calculator.substraction(20,10);
        Assert.assertEquals(10,resultData);
    }

    @Test
    public void givenToCheckMultiplicationOfTwoNumbers() {
        Calculator calculator = new Calculator();
        int resultData = calculator.multiplication(20,10);
        Assert.assertEquals(200,resultData);
    }

    @Test
    public void givenToCheckDivisionOfTwoNumbers() {
        Calculator calculator = new Calculator();
        int resultData = calculator.Division(20,10);
        Assert.assertEquals(2,resultData);
    }

    @Test
    public void givenToCheckModeOfTwoNumbers() {
        Calculator calculator = new Calculator();
        int resultData = calculator.mode(20,10);
        Assert.assertEquals(0,resultData);
    }
}
