import java.util.Scanner;

public class mayor {

	public static void main(String[] args) {
		Scanner calculo = new Scanner(System.in);
		int n1, n2;

		System.out.println("Bienvenido al calculador de MayorMenor de Antonio Djigo :");

		System.out.println("Introduzca el primer número");
		n1 = calculo.nextInt();
		System.out.println("Introduzca el segundo número");
		n2 = calculo.nextInt();

		if (n1 > n2) {
			System.out.println("El número " + n1 + " es mayor que " + n2);
		} else {
			System.out.println("El número " + n2 + " es mayor que " + n1);
		}

	}
}
