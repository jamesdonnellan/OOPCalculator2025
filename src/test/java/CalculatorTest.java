import ie.atu.week9.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest
{
    Calculator myCalc;

    @BeforeEach
    void setup()
    {
        myCalc = new Calculator();
    }

    @Test
    void testAddSuccess()
    {
        assertEquals(8, myCalc.add(4,4));
    }

    @Test
    void testAddFailure()
    {
        assertThrows(IllegalArgumentException.class,  () -> {myCalc.add(Integer.MAX_VALUE, 2);});
    }


    @Test
    void testSubtractSuccess()
    {
        assertEquals(4, myCalc.subtract(8,4));
    }

    @Test
    void testSubtractFailure()
    {
        assertThrows(IllegalArgumentException.class,  () -> {myCalc.subtract(Integer.MIN_VALUE, 1);});
    }

    @Test
    void testDivisionSuccess()
    {
        assertEquals(3, myCalc.division(6,2));
    }

    @Test
    void testDivisionFailure()
    {
        assertThrows(ArithmeticException.class,  () -> {myCalc.division(6,0);});
    }

    @Test
    void testMultiplySuccess()
    {
        assertEquals(9, myCalc.multiply(3,3));
    }

    @Test
    void testMultiplyFailure() // multiplication feature //
    {
        assertThrows(UnsupportedOperationException.class,  () -> {
            myCalc.multiply(Integer.MAX_VALUE, 2);});
    }

}
