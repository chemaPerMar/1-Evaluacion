package ejercicio_6;

public class Ejercicio_6 {
	public static void main(String[] args) {
		
		boolean off = false;
		int number = 34;
		char character = 'g';
		float decimal = 5.5F;
		String firstString = Boolean.toString(off);
		String secondString =Integer.toString(number);
		String thirdString = Character.toString(character);
		String fouthString = Double.toString(decimal);
		
		
		System.out.println(firstString + " " + secondString + " " + thirdString + " " + fouthString);
	}
}
