package Tema2_3;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int decision, n;

		System.out.println("¿Que quieres hacer?");
		System.out.println("1: Comprobar si un numero es perfecto");
		System.out.println("2: Factorizar un numero perfecto");
		System.out.println("3: Imprimir los numeros perfectos ubicados entre 1 y 10000");

		decision = keyboard.nextInt();

		switch (decision) {
		case 1:
			System.out.println("Introduce un numero");
			n = Math.abs(keyboard.nextInt());
			keyboard.close();
			System.out.println(isPerfectNumber(n));
			break;
		case 2:
			System.out.println("Introduce un numero");
			n = Math.abs(keyboard.nextInt());
			keyboard.close();
			System.out.println(PerfectNumberFactors(n));
			break;
		case 3:
			keyboard.close();
			perfectNumberBetween1and10000();
			;
			break;

		default:
			System.out.println("Esa decision no existe");
		}

	}

	public static boolean isPerfectNumber(int n) {
		int result = 0;

		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				result += i;
			}
		}

		return (result == n) ? true : false;
	}

	public static String PerfectNumberFactors(int n) {
		String result = "";

		if (isPerfectNumber(n)) {
			for (int i = 1; i < n; i++) {
				if (n % i == 0) {
					result += i + " + ";
				}
			}

			return result.substring(0, result.length() - 3); // la funcion substring la usamos para quitar el ultimo " +
																// "
		}

		else {
			return "El numero no es perfecto";
		}
	}

	public static void perfectNumberBetween1and10000() {
		for (int i = 1; i <= 10000; i++) {
			if (isPerfectNumber(i)) {
				System.out.println(i);
			}
		}
	}

}
