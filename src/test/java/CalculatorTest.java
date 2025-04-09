import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test public void testAdd() { assertEquals(9, calc.add(4, 5)); }
    @Test public void testSubtract() { assertEquals(3, calc.subtract(8, 5)); }
    @Test public void testMultiply() { assertEquals(20, calc.multiply(4, 5)); }
    @Test public void testDivide() { assertEquals(3, calc.divide(9, 3)); }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() { calc.divide(10, 0); }
}
