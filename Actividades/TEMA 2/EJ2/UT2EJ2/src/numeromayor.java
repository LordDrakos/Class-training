import java.util.Scanner;

public class numeromayor {

	public static void main(String[] args) {
		Scanner calculo = new Scanner(System.in);
		int elpapito = 0;

		for (int i = 0; i < 7; i++) {

			System.out.println("Introduzca los siete n�meros uno a uno: ");
			int nmayor = calculo.nextInt();
			if (nmayor > elpapito) {
				elpapito = nmayor;
			}

		}

		System.out.println("El n�mero m�s grande que has introducido es " + elpapito);

	}

}
