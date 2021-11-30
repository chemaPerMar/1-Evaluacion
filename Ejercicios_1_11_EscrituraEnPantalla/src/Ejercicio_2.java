
public class Ejercicio_2 {
public static void main(String[] args) {
		
		int x=10;
		int y=-10;
		float n=13.269834f;
		String cad="Ana";
		
		System.out.printf("%d\n", x); //Imprimimos x con su formato por defecto
		
		System.out.printf("%+d\n", x); //Imprimimos x con su signo
		
		System.out.printf("%+d\n", y); //Imprimimos y con su signo
		
		System.out.printf("%.2f\n", n); //Imprimimos n con 2 decimales
		
		System.out.printf("%+10.4f\n", n); //Imprimimos n con cuatro decimales y 10 caracteres alineados a la derecha
		
		System.out.printf("%10.5f\n", n); //Imprimimos n con cinco decimales y 10 caracteres alineados a la derecha
		
		System.out.printf("%+010.3f\n", n); //Imprimimos n con tres decimales, con su signo y hacer que tenga 10 caracteres, añadiendo los ceros correspondiente
		
		System.out.printf("n=%-9.2fx=%d\n", n,x); //Imprimiendo 2 variables donde el primero esta 9 caracteres alineado a la izquierda
		
		System.out.printf("%10s%-6s%s", cad,cad,cad); //Imprimiendo 3 veces la variable cadena haciendo uso de la alineacion derecha y izquierda
		
	}
}
