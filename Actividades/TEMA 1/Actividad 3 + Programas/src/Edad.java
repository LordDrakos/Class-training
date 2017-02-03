import java.util.Scanner;

public class Edad {

	public static void main(String[] args) {
		
		Scanner calculo = new Scanner(System.in);
		int year, edad;
		System.out.println("Bienvenido al calculador de edades de Antonio Djigo: ");
		System.out.println("Introduzca su año de nacimiento");
		year = calculo.nextInt();
		edad = ( 2016 - year);
		System.out.println("Su edad es de " + edad + " años.");
	}

}
