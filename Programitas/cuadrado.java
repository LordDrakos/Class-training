import java.util.Scanner;

public class cuadrado {

	public static void main(String[] args)

	{
		System.out.print("Por favor introduce el n�mero: ");
		Scanner lect = new Scanner(System.in);
		int num = lect.nextInt();

		// Opciones:
		// int=num*num;
		// int resul = Cuadrado(num);
		System.out.println("El cuadrado de " + num + " es: " + Cuadrado(num));
		lect.close();
	}

	// m�todo ue calcula el cuadrado de un n�mero
	private static int Cuadrado(int num) {

		int resul = num * num;
		return resul;
	}
}
