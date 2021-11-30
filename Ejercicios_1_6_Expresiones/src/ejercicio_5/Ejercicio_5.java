package ejercicio_5;

public class Ejercicio_5 {
	
	public static void main(String[] args) {
		
		int x = 10;
		int y = 19;
		boolean j = true;
		boolean k = false;
		
		//TODAS LAS OPERACIONES TIENEN QUE DAR COMO RESULTADO TRUE CON EL USO DE LOS PARÉNTESIS
		boolean a = x == y || j ;
		boolean b = x >= y || x <= y && j ;
		boolean c =  ! j || j ;
		boolean d =  ! (k && k);
		
		System.out.printf("a) %B\nb) %B\nc) %B\nd) %B",a,b,c,d);
			
	}

}
