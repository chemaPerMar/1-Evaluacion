package Tema2_3;

import java.util.*;

public class exercise6 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int decision,n;
		
		System.out.println("¿Que quieres hacer?");
		System.out.println("1: Comprobar si un numero es primo");
		System.out.println("2: Imprimir los numeros primos ubicados entre 1 y 10000");
		System.out.println("3: Factorizar un numero");
		
		decision = keyboard.nextInt();
		
		switch(decision)
		{
			case 1: System.out.println("Introduce un numero");
			n= Math.abs(keyboard.nextInt());
			keyboard.close();
			System.out.println(isPrime(n));
			break;
			case 2: keyboard.close();
				primesBetween10000numbers();
			break;
			case 3: System.out.println("Introduce un numero");
			n= Math.abs(keyboard.nextInt());
			keyboard.close();
			System.out.println(descomposition(n));
			break;
			default: System.out.println("Esa decision no existe");
		}

	}
	
	public static Boolean isPrime(int n)
	{
		int divisor = 2, maxFactor=(int)Math.sqrt(n);
		boolean isprime = true;
		
		while(isprime && divisor <= maxFactor)//Aqui se evaluara si n es divisible entre alguno del los numeros positivos menores que n
		{
			if(n % divisor == 0)
			{
				isprime = false;
			}
			divisor++;
		}
		
		return isprime; //Aqui comprobamos si un numero es divisible por mas de 2 divisores (haciendola compuesto) o no
	}
	
	public static void primesBetween10000numbers()
	{
		
		for(int i= 1; i<=10000; i++) //Aqui se evaluara si n es divisible entre alguno del los numeros positivos menores que n
		{
			if(isPrime(i))
			{
				System.out.println(i);
			}
		}
	}
	
	public static String descomposition(int number)
	{
		int primeNumber = 2,index;
		
		String result = "";
		
		while(number != 1)
		{
			index=0; 
			while(true)
			{
				if(isPrime(primeNumber) && primeNumber != 1 && divisors.indexOf(primeNumber) < 0)
				{
					divisors.trimToSize(); //Esta funcion se utiliza para eliminar copias generadas por el arraylist y ahorrar recursos
												//Este bloque de codigo se usará para almacenar los primos en un arraylist y usarla como caché
					divisors.add(primeNumber);
				}
				try {
					if(number % divisors.get(index) == 0) 
					{
						number /= divisors.get(index);
						break;
					}
					
					index++;
				}
				catch (IndexOutOfBoundsException e) //Si en la arraylist no se encuentra el divisor, se salta a la siguiente vuelta
				{
					continue;
				}
				finally //lanze excepcion o no, primeNumber seguirá incrementandose
				{
					primeNumber++;
				}
				
			}
			result += divisors.get(index) + " * ";
		}
			
		return result.substring(0, result.length() -3); //Se realiza un substring para que no aparezca el ultimo " * "
	}
	
	static ArrayList<Integer> divisors= new ArrayList<Integer>();
	
}
