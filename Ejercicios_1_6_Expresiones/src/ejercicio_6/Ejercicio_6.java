package ejercicio_6;

public class Ejercicio_6 {
	
	public static void main(String[] args) {
		
		final int MAX =1000;
		int a=3;
		int b=4;
		int e;
		int i;
		double x;
		char c;
		String s="";
		
		i = (990 - MAX) / a;			//	-10/3=-3 (ser?a decimal pero est? puesto en int )
	//	i = b / 0 ;						//	(ArithmeticalException porque divide entre 0)
		i = a % (MAX - 990);			//	el resto de 3/10 es 3
		i = (MAX - 990) % a;			//	el resto de 10/3 es 1
	//	i = 3.34 * a;					// 	dado que i es un int no puedes usar como factor un decimal, solo funcionar?a si el resultado fuera casteado a int en cuyo caso el resultado ser?a 10
		x = a / b;						//	sale 0.0 porque tanto como dividendo como divisor son de tipo int, si casteara uno de los dos a double el resultado ser?a 0.75	
	//	x = a % (a / b);				//	sale arithmeticalException porque el resultado de la divisi?n sale 0 por el motivo descrito en el apartado anterior, asi que no puede ejecutar el operador de resto con el 0 al otro lado
		i = a / b;						//	sale 0 porque i es int y no puede tener valores decimales
		i=++a;							//	y es igual a 3 (valor de a) + 4
		i=a++;							// 	y es igual a 3 (valor de a) + 4
		c='\'';							// 	solo podriamos introucir el car?cter ' mediante el uso de \' para introducir dicho car?cter especial
		s="c";							// 	no puedes introducir un car?cter entre comillas simples en un String ya que entendera que es de tipo char, debes usar comillas dobles
		s="\'";							//	para meter el car?cter especial ' tienes que "slashearlo" mediante \' al igual que en el tipo char
		s="\"";							//	al ser las comillas dobles otro car?cter especial pasa lo mismo que con las comillas simples, necesitas usar \ para meterlo en una cadena o char
		c='\u0041';						//	car?cter A en hexadecimal ASCII
		c=65;							// 	car?cter A en decimal ASCII

		
		System.out.println(i);
		System.out.println(x);
		System.out.println(c);
		System.out.println(s);
	}

}
