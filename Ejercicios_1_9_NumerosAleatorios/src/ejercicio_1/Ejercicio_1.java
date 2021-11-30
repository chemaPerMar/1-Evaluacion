package ejercicio_1;

import java.util.Random;

public class Ejercicio_1 {
	public static void main(String[] args) {
		
		Random randomFace = new Random();
		
		int faceCoin = randomFace.nextInt(2);
		
		//Comprobando si un numero es cara o cruz
		if(faceCoin == 0)
		{
			System.out.println("Cara");
		}
		else
		{
			System.out.println("Cruz");
		}
		
	}


}
