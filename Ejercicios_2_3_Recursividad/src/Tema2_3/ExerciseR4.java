package Tema2_3;

import java.util.Scanner;

public class ExerciseR4 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		
		int m = keyboard.nextInt();
		
		keyboard.close();
		
		System.out.println(summation(m,0,0));

	}
	
	public static int summation(int m,int n, int result) {
		
		return (result > m) ? n : summation(m,++n,result+n);
		
	}

}
