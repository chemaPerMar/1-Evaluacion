package Ejercicios;

import java.util.Random;

public class Exercise10 {

	public static void main(String[] args) {
		
		Random NumberGenerator = new Random();
		
		int cardNumber = NumberGenerator.nextInt(52) + 1;
		
		int cardSuitNumber = cardNumber / 13;
		
		int cardValue = cardNumber - (13 * cardSuitNumber);
		
		String simbols = "♠♥♦♣";
		
		switch(cardValue) {
			case 1: System.out.print('A');
				break;
			case 11: System.out.print('J');
				break;
			case 12: System.out.print('Q');
				break;
			case 13: System.out.print('K');
				break;
			default: System.out.print(cardValue);
		}
		
		System.out.printf(" " + simbols.charAt(cardSuitNumber));

	}

}
