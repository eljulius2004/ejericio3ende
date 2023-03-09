package apartado2;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import apartado2.UtilidadesFecha;

class UtilidadesFechaTest {

	@Test
	void testComprobarBisiestoTrue() {
		
		boolean esperado = true;
		int anno = 2020;
		boolean res = UtilidadesFecha.comprobarBisiesto(anno);
		assertEquals(esperado, res);
	}

	@Test
	void testComprobarBisiestoFalse() {
		
		boolean esperado = false;
		int anno = 2023;
		boolean res = UtilidadesFecha.comprobarBisiesto(anno);
		assertEquals(esperado, res);
	}
	
	@Test
	void testComprobarBisiestoFalseMultiplo4() {
		
		boolean esperado = false;
		int anno = 1900;
		boolean res = UtilidadesFecha.comprobarBisiesto(anno);
		assertEquals(esperado, res);
	}
}
