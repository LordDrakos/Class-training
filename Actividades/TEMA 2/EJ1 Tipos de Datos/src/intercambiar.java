import java.util.Scanner;

public class intercambiar {

	public static void main(String[] args) {
		Scanner calculo = new Scanner(System.in);
		int a, b, hold;
		
		System.out.println("Vamos a intercambiar dos valores enteros");
		System.out.println("Primero introduzca el valor de a: ");
		a = calculo.nextInt();
		System.out.println("Ahora introduzca el valor de b:  ");
		b = calculo.nextInt();
		System.out.println("Los valores que ha introducido son a = " + a + " y b = " + b);
		System.out.println("Ahora procederemos a intercambiarlos");
		
		hold = a;
		a = b;
		b = hold;
		
		System.out.println("Ahora el valor de A = " + a + " y el de B = " + b);

		

	}

}
