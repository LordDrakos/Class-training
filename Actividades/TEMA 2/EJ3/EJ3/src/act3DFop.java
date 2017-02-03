import java.util.Scanner;

public class act3DFop {

	public static void main(String[] args) {
		System.out.println("Introduzca el numero para realizar el factorial");
		Scanner calculo = new Scanner(System.in);
		int numero = calculo.nextInt();
		System.out.println("Factorial de " + numero + " es: " + factorial(numero));
	}

	static int factorial(int numero) {
		if (numero == 0) {
			return 1;
		} else {
			return numero * factorial(numero - 1);
		}
	}
}