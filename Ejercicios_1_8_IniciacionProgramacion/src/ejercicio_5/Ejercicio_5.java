package ejercicio_5;

public class Ejercicio_5 {
	public static void main(String[] args) {
		
		Double numero = 145.4, numero2 = 13.2, numero3 = 2.5;		
		
		//Comparando 2 numeros con compare()
				
		System.out.println(Double.compare(numero, numero2)); // return x > 0
				
		//Comparando 2 numeros con compareTo()
				
		System.out.println(numero.compareTo(numero2)); // return x > 0
				
		//Haciendo casting a double con doubleValue()
				
		System.out.println(numero.doubleValue()); //145.4
				
		//Comprobar si 2 numeros son iguales con equals()
				
		System.out.println(numero.equals(numero2)); //false
				
		//Haciendo casting a float con floatValue()
		
		System.out.println(numero3.floatValue()); //2.5
		
		//Haciendo casting a int con intValue()
				
		System.out.println(numero3.intValue()); //2
		
		//Comprobar si un numero es infinito con .isInfinity()
		
		System.out.println(numero.isInfinite()); //false
		
		//Comprobar si un argumento numerico es infinito con static isInfinity()
		
		System.out.println(Double.isInfinite(Double.POSITIVE_INFINITY)); //true
		
		//Comprobar si un numero es NaN con .isNaN()
		
		System.out.println(numero.isNaN()); //false
				
		//Comprobar si un argumento numerico es NaN con static isNaN()
				
		System.out.println(Double.isNaN(Double.NaN)); //true
				
		//Sacar el maximo de 2 numeros con max()
				
		System.out.println(Double.max(numero,numero3)); //145.4
				
		//Sacar el minimo de 2 numeros con min()
				
		System.out.println(Double.min(numero,numero3)); //2.5
				
		//Castear un string numerico a double con parseDouble()
				
		System.out.println(Double.parseDouble("500")); //500.0
				
		//Sumar numeros con sum()
				
		System.out.println(Double.sum(2, 3)); //5.0
				
		//Devolver el valor de una variable entera o numero entero con valueOf(int i)
				
		System.out.println(Double.valueOf(numero)); //145.4
				
		//Castear un string numerico a entero con valueOf(String s)
				
		System.out.println(Double.valueOf("400")); //400.0
	}
}
