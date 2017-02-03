import java.util.Scanner;

public class ACT3DF {

	public static void main(String[] args) {
		int num = 0;
		Scanner calculo = new Scanner(System.in);
		System.out.println("Introduzca un número para hacer factorial");

		do {
			System.out.println("introduzca un número mayor a 0");
			num = calculo.nextInt();
		} while (num < 0);

		int ultnum = num;
		num--;

		do {
			ultnum = ultnum * num;
			System.out.println("Numero mutiplicado por " + num + " = " + ultnum);
			num--;
		} while (num >= 1);
		System.out.println("El resultado final es de " + ultnum);
	}

}
