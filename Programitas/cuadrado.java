import java.util.Scanner;

public class cuadrado {

	public static void main(String[] args)

	{
		System.out.print("Por favor introduce el número: ");
		Scanner lect = new Scanner(System.in);
		int num = lect.nextInt();

		// Opciones:
		// int=num*num;
		// int resul = Cuadrado(num);
		System.out.println("El cuadrado de " + num + " es: " + Cuadrado(num));
		lect.close();
	}

	// método ue calcula el cuadrado de un número
	private static int Cuadrado(int num) {

		int resul = num * num;
		return resul;
	}
}
