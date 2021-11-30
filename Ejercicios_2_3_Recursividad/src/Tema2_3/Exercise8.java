package Tema2_3;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		int decision,n;
		
		System.out.println("¿Que quieres hacer?");
		System.out.println("1: Conseguir un numero de fibonnaci segun su posicion");
		System.out.println("2: Imprimir los 30 primeros numeros de fibonnaci");
		System.out.println("3: Imprimir el primer numero de fibonnaci mayor que el argumento pasado");
		
		decision = keyboard.nextInt();
		
		switch(decision)
		{
			case 1: System.out.println("Introduce un numero");
			n= Math.abs(keyboard.nextInt());
			keyboard.close();
			System.out.println(fibonnaci(n));
			break;
			case 2: keyboard.close();
			Oneto30();
			break;
			case 3: System.out.println("Introduce un numero");
			n= Math.abs(keyboard.nextInt());
			keyboard.close();
			System.out.println(majorNumber(n));
			break;
			default: System.out.println("Esa decision no existe");
		}
		
	}

	public static int fibonnaci(int n)
	{
		
		double positiveAureo = Math.pow((1 + Math.sqrt(5)), n);
		
		double nevativeAureo = Math.pow((1 - Math.sqrt(5)), n);
		
		double divisorAureo = Math.pow(2, n) * Math.sqrt(5);
		
		double BinetFormule = (positiveAureo - nevativeAureo) / divisorAureo; //Esta es la famosa formula de binet usada para calcular los numeros de fibonaccio
		
		return (int) BinetFormule;
		
	}
	
	public static void Oneto30()
	{
		for(int i = 0;i<30;i++)
		{
			System.out.println(fibonnaci(i));
		}
	}
	
	public static int majorNumber(int n)
	{
		int i = 0;
		while(fibonnaci(i) <= n)
		{
			i++;
		}
		
		return fibonnaci(i);	
	}
	
}
