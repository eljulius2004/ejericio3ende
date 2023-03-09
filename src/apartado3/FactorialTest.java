package apartado3;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class FactorialTest {

	@Test
	public void testRecursivo() {
		assertEquals(7034535277573963776l, Factorial.calcularFactorialRecursivo(25));
		assertEquals(0,Factorial.calcularFactorialRecursivo(-1));
	
		

	}
	
	@Test
	public void testNormal() {
		assertEquals(7034535277573963776l, Factorial.calcularFactorial(25));
		assertEquals(0,Factorial.calcularFactorial(-1));
	}

}