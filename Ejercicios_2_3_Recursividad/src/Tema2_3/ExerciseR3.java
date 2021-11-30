package Tema2_3;

import java.util.Scanner;

public class ExerciseR3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);

		int number;

		System.out.println("Introduce un numero");

		number = keyboard.nextInt();

		keyboard.close();

		System.out.println(fibonacci(number, 0, 1));

	}

	public static int fibonacci(int numbers, int number1, int number2) {

		return (numbers == 0 || numbers == 1) ? numbers / 1
				: number1 + fibonacci(numbers - 1, number2, number1 + number2);

	}

}
