package ejercicios222;

import java.util.Random;
import java.util.Scanner;
import static ejercicios222.colores.*;

public class Ejercicio14 { public static void main(String[] args) {	//he hecho este ejercicio despues de haber empezado las actividades de funciones pero como esto esta en bucles no he creado ninguna funcion
	
	Scanner keyboard = new Scanner(System.in);
	
	String coordenada;
	int alfilx = 0;
	int alfily = 0;
	String cuadroBlanco = RESET + WHITE_BACKGROUND + "   ";
	String cuadroNegro = RESET + BLACK_BACKGROUND + "   ";
	String puedeMover = RESET + RED_BACKGROUND + "   ";
	int filas;
	int columnas;
	String fila = "";
	
	System.out.println("Introduzca su coordenada para el alfil:");
	coordenada = keyboard.nextLine();
	
	switch (coordenada.substring(1,2)) {
	
	case "1":
		alfilx=1;
		break;
	case "2":
		alfilx=2;
		break;
	case "3":
		alfilx=3;
		break;
	case "4":
		alfilx=4;
		break;
	case "5":
		alfilx=5;
		break;
	case "6":
		alfilx=6;
		break;
	case "7":
		alfilx=7;
		break;
	case "8":
		alfilx=8;
		break;
	}
	
	switch(coordenada.substring(0,1)) {			//estoy seguro de que tiene que haber una forma muy sencilla de abreviar esto pero a la hora de hacer el ejercicio no se me ocurre una
	
	case "A":
		alfily=1;
		break;
		
	case "a":
		alfily=1;
		break;
		
	case "B":
		alfily=2;
		break;
		
	case "b":
		alfily=2;
		break;
		
	case "C":
		alfily=3;
		break;
		
	case "c":
		alfily=3;
		break;
		
	case "D":
		alfily=4;
		break;
		
	case "d":
		alfily=4;
		break;
		
	case "E":
		alfily=5;
		break;
		
	case "e":
		alfily=5;
		break;
		
	case "F":
		alfily=6;
		break;
		
	case "f":
		alfily=6;
		break;
		
	case "G":
		alfily=7;
		break;
		
	case "g":
		alfily=7;
		break;
		
	case "H":
		alfily=8;
		break;
		
	case "h":
		alfily=8;
		break;
	}
	for(filas=1; filas<=8;filas++)  {			//me va imprimiendo las filas una vez se terminan en el bucle de dentro
		fila="";								//vacio la fila para volver a hacer otra nueva en la siguiente iteracion
	for(columnas=8;columnas>=1;columnas--) { 	//me añade casillas en la variable fila en funcion a la columna
		
		if(9-filas == alfilx && 9-columnas==alfily) {			//imprime el alfil donde le ha pedido el usuario, como los cuadros se imprimen al reves de como estan posicionados le resto tanto a filas como a columnas 9 para que me salga el numero inverso en la escala del 1 al 8
			
			if ((filas+columnas)%2==0) {
				fila+=RESET+WHITE_BACKGROUND+BLACK+" * ";
			}
			else if ((filas+columnas)%2!=0) {
				fila+=RESET+BLACK_BACKGROUND+WHITE+" * ";
			}
		}
		
		else if ((filas+columnas)%2==0) {		//imprime un cuadro blanco
			fila+=cuadroBlanco;					
		}
		else if((filas+columnas)%2!=0) {		//imprime un cuadro negro
			fila+=cuadroNegro;
		}
		 if (Math.abs(alfilx-(9-filas))==Math.abs(alfily-(9-columnas))) {		//coloreo de rojo las casillas a los diagonales del alfil
			 
			 if(9-filas == alfilx && 9-columnas==alfily) {
				 
			 }
			 else {
				 fila=fila.substring(0,fila.length()-3)+puedeMover;		//quito la casilla anterior cambiandola por una roja
			 }
		 }
		
	}
	fila=RESET+ " "+(9-filas)+" "+fila; 		//para añadir los numeros antes de cada fila a modo de indice lateral
	System.out.printf("%s\n",fila);				//imprimir la fila una vez creada en el bucle
	}
	System.out.println(RESET+"    A  B  C  D  E  F  G  H "); //imprime el indice inferior
}
}

