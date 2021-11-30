package Ejercicios;
import java.util.*;

public class Exercise9 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String text;
		
		System.out.println("Introduce una cadena de texto");
		
		text = keyboard.nextLine();
		
		keyboard.close();
		
		System.out.println(RandomIndex(text));

	}
	
	public static String RandomIndex(String text)
	{
		
		String resultado;
		
		if(text.length() != 0)
		{
			Random numberGenerator = new Random();
			
			int randomIndex;
			
			randomIndex = numberGenerator.nextInt(text.length());
			
			resultado = "Posicion " + (randomIndex + 1) + ": " + text.charAt(randomIndex);
		}else {
			resultado = null;
		}
		
		return resultado;
	}

}
