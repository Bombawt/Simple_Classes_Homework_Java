import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(25, calculator.add(15, 10));
    }

    @Test
    public void canSubtract(){
        assertEquals(15, calculator.subtract(25, 10));
    }

    @Test
    public void canMultiply(){
        assertEquals(45, calculator.multiply(9, 5));
    }

    @Test
    public void canDivide(){
        assertEquals(7, calculator.divide(35, 5), 0.1);
    }
}
