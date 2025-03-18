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
        assertThrows(IllegalStateException.class,  () -> {myCalc.subtract(Integer.MIN_VALUE, 1);});
    }
}
