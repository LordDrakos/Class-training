import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		Scanner calculo = new Scanner(System.in);
		int n;
		System.out.println("Bienvenido al calculador de años bisiestos de Antonio Djigo");
		System.out.println("Introduzca el número a calcular: ");
		n = calculo.nextInt();
		if (n % 4 == 0) {
			if (n % 400 == 0) {
				System.out.println("El año " + n + " NO es bisiesto");
			} else {
				System.out.println("El año " + n + " si bisiesto");
			}

		}

		else {
			System.out.println("El año " + n + " NO es bisiesto");
		}

	}
}
