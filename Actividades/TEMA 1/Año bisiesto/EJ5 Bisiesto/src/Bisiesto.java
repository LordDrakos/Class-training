import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		Scanner calculo = new Scanner(System.in);
		int n;
		System.out.println("Bienvenido al calculador de a�os bisiestos de Antonio Djigo");
		System.out.println("Introduzca el n�mero a calcular: ");
		n = calculo.nextInt();
		if (n % 4 == 0) {
			if (n % 400 == 0) {
				System.out.println("El a�o " + n + " NO es bisiesto");
			} else {
				System.out.println("El a�o " + n + " si bisiesto");
			}

		}

		else {
			System.out.println("El a�o " + n + " NO es bisiesto");
		}

	}
}
