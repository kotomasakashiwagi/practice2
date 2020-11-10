import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void plusXYTest() {
        IntPair intPair1 = new IntPair(10, 3);
        IntPair intPair2 = new IntPair(-10, 3);
        assertEquals(13, Calculator.plusXY(intPair1));
        assertEquals(-7, Calculator.plusXY(intPair2));
    }

    @Test
    public void minusXYTest() {
        IntPair intPair1 = new IntPair(10, 3);
        assertEquals(7, Calculator.minusXY(intPair1));
        IntPair intPair2 = new IntPair(-10, 3);
        assertEquals(-13, Calculator.minusXY(intPair2));
    }

    @Test
    public void timesXYTest() {
        IntPair intPair = new IntPair(10, 3);
        assertEquals(30, Calculator.timesXY(intPair));
        IntPair intPair2 = new IntPair(-10, 3);
        assertEquals(-30, Calculator.timesXY(intPair2));
    }

    @Test
    public void calculateQAndRTest() {
        IntPair intPair = new IntPair(10, 3);
        assertEquals(new IntPair(3, 1), Calculator.calculateQAndR(intPair));
        IntPair intPair2 = new IntPair(-10, 3);
        assertEquals(new IntPair(-3, -1), Calculator.calculateQAndR(intPair2));
    }

    @Test
    public void calculateAverage() {
        IntPair intPair = new IntPair(10, 3);
        assertEquals(6, Calculator.calculateAverage(intPair));
        IntPair intPair2 = new IntPair(-10, 3);
        assertEquals(-3, Calculator.calculateAverage(intPair2));
    }

}