package Ejercicios;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Introduce una cantidad");

		int cantidad = keyboard.nextInt();

		keyboard.close();

		if (cantidad > 1000) {
			System.out.println(cantidad * 0.15);
		}

		System.out.println("El programa ha acabado");

	}

}
