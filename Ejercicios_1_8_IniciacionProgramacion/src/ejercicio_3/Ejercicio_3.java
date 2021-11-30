package ejercicio_3;

public class Ejercicio_3 {
	
	public static void main(String[] args) {
		
		Character letra = 106, letra2 = 'j',letra3 = '5';
		Character letra4 = ' ';
		
		//conseguir letra usando charValue()
		
		System.out.println(letra.charValue()); //105
		
		//Comparando character con compare()
		
		System.out.println(Character.compare(letra,letra2)); //0
		
		//Comparando character con equals()
		
		System.out.println(letra.equals(letra2)); //true
		
		//Comprobando si un caracter es numerico con isDigit()
		
		System.out.println(Character.isDigit(letra3)); //true
		
		//Comprobando si un caracter es alfabetico con isLetter()
		
		System.out.println(Character.isLetter(letra)); //true
		
		//Comprobando si un caracter es minuscula con isLowerCase()
		
		System.out.println(Character.isLowerCase(letra)); //true
		
		//Comprobando si un caracter es un espacio con isSpaceChar()
		
		System.out.println(Character.isSpaceChar(letra4)); //true
		
		//Comprobando si un caracter es mayuscula con isLowerCase()
		
		System.out.println(Character.isUpperCase(letra)); //false
		
		//Transformando una minuscula en mayuscula
		
		System.out.println(Character.toUpperCase(letra)); //J
		
		//Transformando una mayuscula en minuscula
		
		System.out.println(Character.toUpperCase('I')); //i
		
		//Devuelve el valor de un argumento de tipo caracter
		
		System.out.println(Character.valueOf(letra)); //j
	}

}
