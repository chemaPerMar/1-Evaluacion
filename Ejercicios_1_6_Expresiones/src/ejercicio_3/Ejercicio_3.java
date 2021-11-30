package ejercicio_3;

public class Ejercicio_3 {
	
	public static void main(String[] args) {
		boolean a=true;
		boolean b=false;
		boolean c=true;
		
		boolean resultadoA = a && b || a && c;
		boolean resultadoB = (a || ! b) && (! a || c);
		boolean resultadoC = a || b && c ;
		boolean resultadoD =  ! (a || b) && c;
		
		System.out.printf("a) %B\nb) %B\nc) %B\nd) %B",resultadoA,resultadoB,resultadoC,resultadoD);
	}

}
