package ejercicio_1;

import java.util.Scanner;

public class Ejercicio_1 {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String name, lastName;
		String street,province;
		int numberStreet, postalCode;
		int age;
		float height;
		
		boolean isStudent;
		
		//Nombre y apellidos
		System.out.println("Introduce tu nombre");
		name = keyboard.nextLine();
		
		System.out.println("Introduce tu apellido");
		lastName = keyboard.nextLine();
		
		//Dirección
		System.out.println("Introduce tu Direccion: 1: Calle, 2: Numero de calle, 3: Codigo Postal");
		street = keyboard.nextLine();
		numberStreet = keyboard.nextInt();
		postalCode = keyboard.nextInt();
		
		//Provincia
		System.out.println("¿Donde vives?");
		
		keyboard.nextLine(); //Salto de linea necesario para que no ocurra el error de saltarse un scanner
		
		province = keyboard.nextLine();
		
		//Edad
		System.out.println("Introduce tu edad");
		age = keyboard.nextInt();
		
		//Estudiante
		System.out.println("Eres un estudiante: true/false");
		
		isStudent = keyboard.nextBoolean();
		
		//Altura de la persona
		System.out.println("Introduce tu altura");
		
		height = keyboard.nextFloat();
		
		keyboard.close();
		
		//Imprimiendo los datos
		
		System.out.println("Tu nombre completo es " + name + " " + lastName + " y "
				+ "tienes " + age + " años.\n");
		
		System.out.println("Vives en la calle " + street + " " + numberStreet
				+ "\nTu codigo postal es " + postalCode + " y vives en " + province);
		
		if(isStudent)
		{
			System.out.println("Eres un estudiante");
		}
		
		System.out.println("Mides " + height + " cm");
		

	}

}
