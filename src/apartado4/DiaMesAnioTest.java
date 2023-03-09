package apartado4;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import apartado2.UtilidadesFecha;

class DiaMesAnioTest {

	@Test
	void testDiaMesAniodia30(){
		int mes = 4, resEsp = 30, anio = 2020, res;
		boolean esBisiesto;
		esBisiesto= UtilidadesFecha.comprobarBisiesto(anio);
		res = DiaMesAnio.calcularDiasMesAnio(mes, anio);
		assertEquals(resEsp, res, 0);
	}
	@Test
	void testDiaMesAniodia31(){
		int mes = 5, resEsp = 31, anio = 2020, res;
		boolean esBisiesto;
		esBisiesto= UtilidadesFecha.comprobarBisiesto(anio);
		res = DiaMesAnio.calcularDiasMesAnio(mes, anio);
		assertEquals(resEsp, res, 0);
	}
	
	@Test
	void testComprobarBisiestoFebTrue() {	
		
		int mes = 2, resEsp = 29, anio = 2020, res;
		boolean esBisiesto;
		esBisiesto= UtilidadesFecha.comprobarBisiesto(anio);
		res = DiaMesAnio.calcularDiasMesAnio(mes, anio);
		assertEquals(resEsp, res, 0, "ERROR");
	}

	@Test
	void testComprobarBisiestoFebFalse() {
		
		int mes = 2, resEsp = 28, anio = 2023, res;
		boolean esBisiesto;
		esBisiesto= UtilidadesFecha.comprobarBisiesto(anio);
		res = DiaMesAnio.calcularDiasMesAnio(mes, anio);
		assertEquals(resEsp, res, 0, "ERROR");
	}
	
	

}
