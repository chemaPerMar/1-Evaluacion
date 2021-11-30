package ejercicio_7;

public class Ejercicio_7 {
	
	public static void main(String[] args) {
		
		int lado1 = 3;
		double precio = 325.6;
		int lado2 = 4;
		boolean comprar = false;
		int hipotenusa = 5;
		char ch = '7';
		
		double rA = 5 * precio - 1.50; 									//	1626.5
		boolean rB = (precio < 300 + 0.1 * precio) || comprar ; 		//	true
	//	boolean rC = sqrt(lado1) + sqrt(lado2) = sqrt(hipotenusa);		//	= es un operador de asignacion para que funcionara deberia de ser == 			
	//	boolean rD = (! comprar) && (precio + 125.3) ; 					//	! y && son operadores booleanos y precio no es booleano
		boolean rE = (ch <= 'A') && comprar ; 							//	7 en decimal ASCII es 55 y A es 65 por lo tanto ch <= 'A' es true asi que el resultado total es false
	//	boolean rF = ch = '7' || ! comprar;								// 	= es un operador de asignacion para que funcionara deberia de ser == 
		
		System.out.println(rA);
		System.out.println(rB);
	//	System.out.println(rC);
	//	System.out.println(rD);
		System.out.println(rE);
	//	System.out.println(rF);
		
	}

}
