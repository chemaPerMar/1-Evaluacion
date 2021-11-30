package Ejercicios;

import java.util.*;

public class Exercise8 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int days;
		
		float distance;
		
		final float pricePerKilometre= 0.35F;
		
		float totalPrice;
		
		System.out.println("Introduce los dias de estancia");
		
		days = keyboard.nextInt();
		
		System.out.println("Introduce la distancia que recorrerá el viaje");
		distance = keyboard.nextFloat();
		
		keyboard.close();
		
		totalPrice = distance * pricePerKilometre;
		
		if(Discount(distance, days)) {
			totalPrice *= 0.30;
		}
		
		System.out.printf("El precio del billete ida y vuelta es %.2f", totalPrice * 2);

	}
	
	public static boolean Discount(float distance, int days)
	{
		if(distance == 0 || days == 0) throw new IllegalArgumentException();
		return (distance > 1000 && days > 7) ? true : false;
	}

}
