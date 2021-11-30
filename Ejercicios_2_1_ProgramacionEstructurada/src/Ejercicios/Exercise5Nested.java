package Ejercicios;

import java.util.Scanner;

public class Exercise5Nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Introduce una nota");
		
		int nota = keyboard.nextInt();
		
		keyboard.close();
		
		if(nota >= 0 && nota <= 2) {
			System.out.println("Es deficiente");
		}else {
			if(nota >= 3 && nota <= 4) {
				System.out.println("Insuficiente");
			}else {
				if(nota == 5) {
					System.out.println("Suficiente");
				} else {
					if(nota == 6) {
						System.out.println("Bien");
					} else {
						if(nota >= 7 && nota <= 8) {
							System.out.println("Notable");
						} else {
							if(nota >= 9 && nota <= 10) {
								System.out.println("Sobresaliente");
							} else {
								System.out.println("Nota incorrecta");
							}
						}
					}
				}
			}
		}
		
	}

}
