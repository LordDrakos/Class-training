import java.util.Scanner;

public class media {

	public static void main(String[] args) {
		Scanner calculo = new Scanner(System.in);
		// Crear las variables
		int n1, n2, n3, media;

		System.out.println("Bienvenido al calculador de medias de Antonio Djigo, introduzca las 3 notas a calcular:");

		// Solicitar las 3 variables

		System.out.println("Introduzca la primera nota");
		n1 = calculo.nextInt();
		System.out.println("Introduzca la segunda nota");
		n2 = calculo.nextInt();
		System.out.println("Introduzca la tercera nota");
		n3 = calculo.nextInt();

		// Calcular Media
		media = (n1 + n2 + n3) / 3;

		// Mostrar media
		System.out.println("La media total del alumno es de " + media);
	}

}
//