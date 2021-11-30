package Tema2_3;

import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int n;
		
		System.out.println("Introduce un numero");
		
		n = keyboard.nextInt();
		
		keyboard.close();
		
		if(n < 0)
		{
			System.out.println("No admitimos numeros negativos");
			System.exit(-1);
		}
		
		System.out.println("El inverso de " + n + " es " + invertedNumber(n));
	}
	
	public static int invertedNumber(int n) //Esta funcion usa el metodo de descomposicion de los numeros para invertir los numeros
	{
		int invertednumber = n % 10;
		while(n / 10 >= 1)
		{
			n /= 10;
			invertednumber = invertednumber * 10 + (n % 10); 
		}
		
		return invertednumber;
	}

}
