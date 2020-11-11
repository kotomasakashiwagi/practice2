import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DaysCalculatorTest {
    @Test
    public void times365Test() {
        assertEquals(3650, Calculator.times365(10));
        assertEquals(0, Calculator.times365(0));
        assertEquals(365, Calculator.times365(1));
    }

}