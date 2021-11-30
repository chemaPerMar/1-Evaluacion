package Ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Exercise9Test {

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
	void RetornarUnValorNoNuloSiLongitudEsMayorQueCero() {
		String text = "Maincra";
		
		System.out.println(Exercise9.RandomIndex(text));
		
		assertNotNull(Exercise9.RandomIndex(text));
	}
	
	@Test
	void RetornarUnValorNuloSiLongitudEsCero() {
		String text = "";
		
		System.out.println(Exercise9.RandomIndex(text));
		
		assertNull(Exercise9.RandomIndex(text));
	}

	/*No es necesario hacer test para argumentos que no sean cadena porque
	el metodo ya te exige que sean cadenas y por el scanner con nextLine, 
	pases lo que pases, sera cadena*/
	
}
