package Ejercicios;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		int [] numbers = new int[3];
		
		int [] priorityNumbers = new int[3];
		
		for(int i = 0; i < numbers.length; i++)
		{
			System.out.printf("Introduce el numero %d\n",i);
			numbers[i] = keyboard.nextInt();
		}
		
		keyboard.close();
		
		for(int i = 2; i >= 0; i--)
		{
			int priority = 0;
			
			for(int j = 0; j < numbers.length; j++)
			{
				if(numbers[i] >= numbers[j]) {
					priority++;
				}
			}
			
			priorityNumbers[priority - 1] = numbers[i];
		}
		
		for(int i = 0; i < priorityNumbers.length; i++)
		{
			System.out.println(priorityNumbers[i]);
		}
	}

}
