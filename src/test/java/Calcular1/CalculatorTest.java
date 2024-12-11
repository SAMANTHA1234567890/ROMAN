package Calcular1;
import static org.junit.jupiter.api.Assertions.assertEquals;
import Calculator1.Calculator;
import org.junit.jupiter.api.Test;
public class CalculatorTest {
    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(7, result, "2 + 3 doit être égal à 5");
    }
}
