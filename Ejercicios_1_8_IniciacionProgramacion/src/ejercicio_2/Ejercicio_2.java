package ejercicio_2;

public class Ejercicio_2 {
	
	public static void main(String[] args) {
	
		String text1 = "Este es el primer texto";
		String text2 = "este es el prImer texto";
		String text3 = "Este es el primer texto";
		
		//Devolver letra dependiendo de la posicion que le demos con charAt()
		
		System.out.println("En la posicion 5 de \'" + text1 + "\' esta la letra " + text1.charAt(5)); //e
		
		//Devolver cantidad de letras de una cadena con length()
		
		System.out.println("La cantidad de letras que tiene \'" + text1 + "\' es " + text1.length()); //23
		
		//Devolver letra en su version ASCII dependiendo de la posicion que le demos con codePointAt()
		
		System.out.println("En la posicion 5 de \'" + text1 + "\' esta la letra " + text1.codePointAt(5)); //101
		
		//Comparando cadenas con compareTo: 0 = igual, x < 0 si es menor, x > 0 si es mayor 
		
		System.out.println(text1.compareTo(text3)); //0
		
		//Comparando cadenas (ignorando mayusculas) con compareTo: 0 = igual, x < 0 si es menor, x > 0 si es mayor 
		
		System.out.println(text1.compareToIgnoreCase(text2)); //0
		
		//Concatenando con concat()
		
		System.out.println(text1.concat(text2)); //Este es el primer textoeste es el prImer texto
		
		//Comprobando si una cadena termina con un sufijo concreto
		
		System.out.println(text1.endsWith("exto")); //true
		
		//Comprobando si varias cadenas son iguales entre si con equals()
		
		System.out.println(text1.equals(text3)); //true
		
		System.out.println(text1.equals(text2)); //false
		
		//Comprobando si varias cadenas ignorando las mayusculas son iguales entre si con equalsIgnoreCase()
		
		System.out.println(text1.equalsIgnoreCase(text2)); //true
		
		System.out.println(text1.equalsIgnoreCase(text3)); //true
		
		//Buscando la posicion de una letra poniendo su codigo ASCII con indexOf(int ch)
		
		System.out.println(text1.indexOf(101)); //3
		
		//Buscando la posicion de una letra empezando desde una posicion concreta con indexOf(int ch, int fromIndex)
		
		System.out.println(text1.indexOf(101, 4)); //5
		
		//Buscando la posicion de una letra poniendo su con indexOf(String ch)
		
		System.out.println(text1.indexOf("texto")); //18
		
		//Buscando la posicion de una letra empezando desde una posicion concreta con indexOf(String ch, int fromIndex)
		
		System.out.println(text1.indexOf("e", 4)); //5
		
		//Comprobando si una cadena esta vacio con isEmpty()
		
		System.out.println("".isEmpty()); //true
		
		//Buscando la ultima posicion de la letra en ASCII pasada por argumento con lastIndexOf(int ch)
		
		System.out.println(text1.lastIndexOf(101)); //19
		
		//Buscando la ultima posicion de una letra terminando en una posicion concreta con lastIndexOf(int ch, int fromIndex)
		
		System.out.println(text1.lastIndexOf(101, 4)); //3
				
		//Buscando la ultima posicion de una letra poniendo su con lastIndexOf(String ch)
				
		System.out.println(text1.lastIndexOf("e")); //19
				
		//Buscando la ultima posicion de una letra terminando en una posicion concreta con lastIndexOf(String ch, int fromIndex)
				
		System.out.println(text1.lastIndexOf("e", 4)); //3
		
		//Remplazando caracteres con replace()
		
		System.out.println(text1.replace('e', 'z')); //Estz zs zl primzr tzxto
		
		//Convertir a mayusculas con toUpperCase()
		
		System.out.println(text1.toUpperCase()); //ESTE ES EL PRIMER TEXTO
		
		//Eliminar los espacios iniciales y finales con trim()
		
		System.out.println(" hola gente ".trim()); //hola gente
}
}
