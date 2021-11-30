package ejercicio_4;

public class Ejercicio_4 {
	public static void main(String[] args) {
		
Integer numero = 257, numero2 = 13, numero3 = 10000000;
		
		//Haciendo casting a byte con byteValue()
		
		System.out.println(numero.byteValue()); //1
		
		//Comparando 2 numeros con compare()
		
		System.out.println(Integer.compare(numero, numero2)); // return x > 0
		
		//Comparando 2 numeros con compareTo()
		
		System.out.println(numero.compareTo(numero2)); // return x > 0
		
		//Haciendo casting a double con doubleValue()
		
		System.out.println(numero.doubleValue()); //257.0
		
		//Comprobar si 2 numeros son iguales con equals()
		
		System.out.println(numero.equals(numero2)); // false
		
		//Haciendo casting a entero con intValue()
		
		System.out.println(numero3.intValue()); //10000000
		
		//Sacar el maximo de 2 numeros con max()
		
		System.out.println(Integer.max(numero,numero3)); //10000000
		
		//Sacar el minimo de 2 numeros con min()
		
		System.out.println(Integer.min(numero,numero3)); //257
		
		//Castear un string numerico a entero con parseInt()
		
		System.out.println(Integer.parseInt("500")); //500
		
		//Sumar numeros con sum()
		
		System.out.println(Integer.sum(2, 3)); //5
		
		//Devolver el valor de una variable entera o numero entero con valueOf(int i)
		
		System.out.println(Integer.valueOf(numero)); //257
		
		//Castear un string numerico a entero con valueOf(String s)
		
		System.out.println(Integer.valueOf("400")); //400
	}
}
