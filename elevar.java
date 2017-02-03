import java.util.Scanner;

public class elevar {
	
	public static void main (String[]args) {
		Scanner calculo = new Scanner(System.in);
		int num;
		

	System.out.println("Introduzca el número a calcular ");

	num = calculo.nextInt();
	int resul = num * num;

	System.out.println("El cuadrado del número " + num + " es " + resul);

	}
}

