package Calcular1;
import static org.junit.jupiter.api.Assertions.assertEquals;
import Calculator1.Calculator;
import org.junit.jupiter.api.Test;
public class CalculatorTest {
    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(4, 4);
        assertEquals(8, result, "2 + 3 doit être égal à 5");
    }
    @Test
    public void  testdiv(){
        Calculator calculator = new Calculator();
        String result = calculator.DIV(8, 4);
        assertEquals("2",result,"Si on a diviser 8 par 4 on vas avoir 2");



    }




}
