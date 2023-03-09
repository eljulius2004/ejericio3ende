package apartado1;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
class RectanguloTest {
	
	
	@Test
	void testArea() {
		int resultadoEsperado=35;
		Rectangulo a = new Rectangulo(7, 5);
		float res = a.area();
		assertEquals(resultadoEsperado,res,  0,"ERROR");
		}
	}


