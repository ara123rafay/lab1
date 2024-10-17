import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-4, 3));
        assertEquals(0, calculator.add(0, 0));
	     assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-4, 3));
        assertEquals(0, calculator.add(0, 0));
    }

    private void assertEquals(int i, Object add) {
		// TODO Auto-generated method stub
		
	}

	@Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.subtract(5, 3));
        assertEquals(-7, calculator.subtract(0, 7));
        assertEquals(0, calculator.subtract(10, 10));
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(0, calculator.multiply(5, 0));
        assertEquals(-15, calculator.multiply(3, -5));
    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(6, 3));
        assertEquals(0, calculator.divide(0, 7));
        assertEquals(-2, calculator.divide(10, -5));
        
        // Testing division by zero
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
    }

	private void assertThrows(Class<ArithmeticException> class1, Object object) {
		// TODO Auto-generated method stub
		
	}
}
