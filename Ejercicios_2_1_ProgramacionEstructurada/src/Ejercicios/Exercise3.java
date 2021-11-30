package Ejercicios;

import java.util.*;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		float numero1,numero2;
		
		System.out.println("Introduce un numero");
		
		numero1 = keyboard.nextFloat();
		
		System.out.println("Introduce otro numero");
		
		numero2 = keyboard.nextFloat();
		
		keyboard.close();
		
		if(isMultiply(numero1,numero2)) {
			System.out.printf("%d es multiplo de %d",numero1,numero2);
		}else {
			System.out.printf("%d no es multiplo de %d",numero1,numero2);
		}
		
	}
	
	public static boolean isMultiply(double x,double y)
	{
		if(x<y || y == 0) throw new IllegalArgumentException();
		return (x % y == 0) ? true : false;
	}

}
