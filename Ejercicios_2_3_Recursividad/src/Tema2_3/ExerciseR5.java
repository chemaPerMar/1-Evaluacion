package Tema2_3;

import java.util.Scanner;

public class ExerciseR5 {

	public static void main(String[] args) {
		
		Scanner keyboard= new Scanner(System.in);
		
		int n;
		
		System.out.println("Introduce un numero");
		
		n= keyboard.nextInt();
		
		if(n == 0)
		{
			System.out.println("La torre 3 ya tiene 0 discos ;)");
			System.exit(0);
		}
		else if(n < 0) {
			System.out.println("Pensabas que poniendo un numero negativo, te cargabas el programa, pero te lo pongo positivo");
			n = Math.abs(n);
		}
		
		keyboard.close();
		
		Hanoi(n,1,3,2);

	}
	
	public static void Hanoi(int nDisks, int originTower,int destinationTower, int retentionTower)
	{
		
		if(nDisks == 1)
		{
			System.out.printf("%d → %d\n",originTower, destinationTower);
		}
		else
		{
			Hanoi(nDisks-1,originTower,retentionTower,destinationTower);
			System.out.printf("%d → %d\n",originTower, destinationTower);
			Hanoi(nDisks-1,retentionTower,destinationTower,originTower);
		}
		
	}

}
