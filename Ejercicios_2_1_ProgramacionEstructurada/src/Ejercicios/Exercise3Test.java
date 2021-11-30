package Ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Exercise3Test {

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

	@ParameterizedTest
	@CsvSource({"6, 2", "6, 6"})
	void DeberiaRetornarTrueSiEsMultiplo(int number1, int number2) {

		assertTrue(Exercise3.isMultiply(number1, number2)); // debe retornar true
	}

	@Test
	void DeberiaRetornarFalseSiNoEsMultiplo() {

		assertFalse(Exercise3.isMultiply(6.2, 4)); // debe retornar false

	}
	
	@Test
	void DeberiaLanzarExcepcionSiElSegundoNumeroEsMayorQueElPrimero() {

		assertThrows(IllegalArgumentException.class, () -> 
		Exercise3.isMultiply(6, 8)); 

	}
	
	@Test
	void DeberiaLanzarExcepcionSiYEsCero() {

		assertThrows(IllegalArgumentException.class, () -> 
		Exercise3.isMultiply(6, 0)); 

	}
	
	/*No es necesario hacer test para argumentos cadenas porque
	el metodo ya te exige que sean numericos*/

}
