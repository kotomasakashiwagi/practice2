import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DaysCalculatorTest {
    @Test
    public void times365Test() {
        assertEquals(3650, DaysCalculator.times365(10));
        assertEquals(0, DaysCalculator.times365(0));
        assertEquals(365, DaysCalculator.times365(1));
    }

}