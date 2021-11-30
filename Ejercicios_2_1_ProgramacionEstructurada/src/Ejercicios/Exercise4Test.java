package Ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Exercise4Test {

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
	void RetornarPositivo() {
		int number = 5;
		
		String actual = Exercise4.NumberType(number);
		
		String expected = "Es positivo";
		
		assertEquals(expected, actual);
	}
	
	@Test
	void RetornarNegativo() {
		int number = -5;
		
		String actual = Exercise4.NumberType(number);
		
		String expected = "Es negativo";
		
		assertEquals(expected, actual);
	}
	
	@Test
	void RetornarCero() {
		int number = 0;
		
		String actual = Exercise4.NumberType(number);
		
		String expected = "Es cero";
		
		assertEquals(expected, actual);
	}
	
	/*No es necesario hacer test para argumentos cadenas o decimales porque
	el metodo ya te exige que sean enteros*/

}
