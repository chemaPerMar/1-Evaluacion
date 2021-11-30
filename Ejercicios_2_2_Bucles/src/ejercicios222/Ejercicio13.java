package ejercicios222;

import java.util.Random;
import java.util.Scanner;
import static ejercicios222.colores.*;

public class Ejercicio13 {public static void main(String[] args) {
	
	Scanner keyboard = new Scanner (System.in);
	Random random = new Random();
	 
	String fila1 = "" ;
	String fila2 = "" ;
	String casillaNegra = RESET + BLACK_BACKGROUND + "   ";
	String casillaBlanca = RESET + WHITE_BACKGROUND + "   ";
	
	for (int i = 1; i<=4; i++) {
		
	fila1 += casillaBlanca + casillaNegra;		//creo las filas que empiezan por casilla blanca
	fila2 += casillaNegra + casillaBlanca;		//creo las filas que empiezan por casilla negra
	
	}
	for (int i = 1, j=8 ; i <= 4 ; i++,j=j-2 ) {
		
		System.out.printf("%s%d %s\n%s%d %s\n",RESET,j,fila1,RESET,j-1,fila2);		//imprimo el tablero
		
	}
	System.out.println(RESET + "   A  B  C  D  E  F  G  H ");
}

}
