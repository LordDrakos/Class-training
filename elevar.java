import java.util.Scanner;

public class elevar {
	
	public static void main (String[]args) {
		Scanner calculo = new Scanner(System.in);
		int num;
		

	System.out.println("Introduzca el n�mero a calcular ");

	num = calculo.nextInt();
	int resul = num * num;

	System.out.println("El cuadrado del n�mero " + num + " es " + resul);

	}
}

