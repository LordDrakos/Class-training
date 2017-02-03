import java.io.IOException;
import java.util.Scanner;

public class t2ej4 {

	public static void main(String[] args) throws IOException {
		int ContA = 0, ContB = 0, ContC = 0, ContX = 0, categoria;
		double porcentajeA, porcentajeB, porcentajeC, porcentajeX;
		int visitas = 0;
		char hold = 0;
		Scanner calculo = new Scanner(System.in);

		System.out.println("Introduzca la categoría de la visita que ha realizado");

		while (hold != 35) {

			hold = (char) System.in.read();
			categoria = (char) hold;
			

			switch (categoria) {
			case 65:
				ContA++;
				visitas++;
				break;
			case 66:
				ContB++;
				visitas++;
				break;
			case 67:
				ContC++;
				visitas++;
				break;
			case 88:
				ContX++;
				visitas++;
				break;
			case 35:
				System.out.println("Ha decidido salir del programa, calculando porcentajes...");
				porcentajeA = (ContA * 100) / visitas;
				porcentajeB = (ContB * 100) / visitas;
				porcentajeC = (ContC * 100) / visitas;
				porcentajeX = (ContX * 100) / visitas;
				System.out.println("Número de viviendas visitadas = " + visitas + " \n Casas con categoría A = "
						+ porcentajeA + "% \n Casas con categoría B = " + porcentajeB + "% \n Casas con categoría C ="
						+ porcentajeC + "% \n Casas sin categoría = " + porcentajeX + "%");
				break;
			}
				if (categoria != 65 && categoria != 66 && categoria != 67 && categoria != 88 && categoria != 35) {
					System.out.println("Caracter erroneo, introduzca A, B, C o X");
				}}
			}

		
	}
