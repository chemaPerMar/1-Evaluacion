package ejercicio_2;

public class Ejercicio_2 {

	public static void main(String[] args) {
		
		int resultadoA = 3 * 5 - 4 / 2; 
		int resultadoB = (int)(3 - Math.pow((4.0 * 5.0), 2) / 4);
		int resultadoC = (int)(Math.pow(3, 2)-5*2);
		int resultadoD = 7 - 4 * 2 - 5 * 2;
		boolean resultadoE = 5 + 4 < 7 + 8;
		boolean resultadoF = 4 < 5 * 4 / 2 - 7 ;
		int resultadoG = 3 + 6 * 14 ;
		int resultadoH =  8 + 7 * 3 + 4 * 6;
		int resultadoI =  (int)(- 4 * 7 + Math.pow(2, 3)/ 4 - 5);
		int resultadoJ = 12 + 3 * 7 + 5 * 4;
		boolean resultadoK =  ! (4 > 6);
		int resultadoL = (int)(Math.pow(7, 3)/ 2 + 6);
		
		System.out.printf("a) %d\nb) %d\nc) %d\nd) %d\ne) %B\nf) %B\ng) %d\nh) %d\ni) %d\nj) %d\nk) %B\nl) %d",resultadoA,resultadoB,resultadoC,resultadoD,resultadoE,resultadoF,resultadoG,resultadoH,resultadoI,resultadoJ,resultadoK,resultadoL);
	}
}
