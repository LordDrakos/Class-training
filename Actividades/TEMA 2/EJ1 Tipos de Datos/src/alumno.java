import java.io.IOException;
import java.util.Scanner;

public class alumno {

	public static void main(String[] args) throws IOException {
		Scanner calculo = new Scanner(System.in);
		int edad, entrada = 0;
		char c1;

		System.out.println("Bienvenido a secretaría, introduzca su edad");
		edad = calculo.nextInt();

		System.out.println("Ahora introduzca su metodo de acceso, donde : \n" + "A = Acceso Directo \n"
				+ "G = Grado Medio \n" + "P = Prueba de acceso");

		do {
			System.out.println("Por favor, introduzca un valor válido (A, G, P): ");
			c1 = (char) System.in.read();
			entrada = (int) c1;

		} while (entrada != 65 && entrada != 80 && entrada != 71);

		if (edad < 18 && entrada == 65) {
			System.out.println("Pase por secretaría");
		} else {

			if (entrada == 80 || entrada == 71 && edad >= 18) {
				System.out.println("Solicite código en Jefatura");

			} else {
				System.out.println("Las clases son en la R03, gracias");
			}
		}
	}
}
