package ejercicio_1;

public class Ejercicio_1 {
	
	public static void main(String[] args) {
		
		double number1 = 1.6, number2 = 4.4, negatenumber = -2.6;
				
				//valor absoluto abs()
				
				System.out.println("El valor absoluto de " + negatenumber + " es " + Math.abs((float)negatenumber)); //2.6
				
				//suma con addexact()
				
				System.out.println("La suma de " + (int)number1 + " y " + (int)number2 + " es " + Math.addExact((int)number1, (int)number2)); //5
				
				//redondear hacia arriba con ceil
				
				System.out.println(Math.ceil(number1) + " y " + Math.ceil(negatenumber)); //2.0 y -2.0
				
				//decrementar en 1 con decrementExact
				
				System.out.println((int)number2 + " - 1 = " + Math.decrementExact((int)number2)); //3
				
				//redondear hacia abajo con ceil
				
				System.out.println(Math.floor(number1) + " y " + Math.floor(negatenumber)); //1.0 y -3.0
				
				//incrementar en 1 con incrementExact
				
				System.out.println((int)number1 + " + 1 = " + Math.incrementExact((int)number1)); //2
				
				//Sacar el mayor numero con max
				
				System.out.println("El mas grande entre " + number1 + " y " + number2 + " es " + Math.max(number1, number2)); //4.4
				
				//Multiplicación con multiplyExact 
		
				System.out.println("La multiplicacion de " + (int)number1 + " y " + (int)number2 + " es " + Math.multiplyExact((int)number1, (int)number2)); //4
				
				//Pasar de positivo a negativo o viceversa con negateExact
				
				System.out.println("El valor invertido de " + (int)negatenumber + " es " + Math.negateExact((int)negatenumber)); //2
		
	}						
}
