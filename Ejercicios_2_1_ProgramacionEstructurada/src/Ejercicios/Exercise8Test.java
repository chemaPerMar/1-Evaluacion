package Ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Exercise8Test {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void RetornarDescuento() {
		Float distance= 1000.1F;
		int days = 9;
		
		assertTrue(Exercise8.Discount(distance, days));
	}
	
	@ParameterizedTest
	@CsvSource({"555.5F, 8", "1002F, 2" , "333F, 4"})
	void RetornarNoDescuento(float distance, int days) {
		
		assertFalse(Exercise8.Discount(distance, days));
	}
	
	@ParameterizedTest
	@CsvSource({"0, 8", "1002F, 0"})
	void RetornarExcepcionSiUnArgumentoEsCero(float distance, int days) {

		assertThrows(IllegalArgumentException.class, () -> 
		Exercise8.Discount(distance, days)); 

	}
	
	/*No es necesario hacer test para argumentos cadenas porque
	el metodo ya te exige que sean numericos*/

}
