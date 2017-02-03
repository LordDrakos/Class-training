import java.util.Scanner;
public class ascii {

	public static void main(String[] args) {
		Scanner calculo = new Scanner(System.in);
		char c;
		
		System.out.println("Bienvenido al traductor ascii a entero");
		System.out.println("Introduzca un número entero");
		int a = calculo.nextInt();
		System.out.println("Ahora procederemos a traducir el valor");
		c = (char) a;
		System.out.println("El caracter ASCII que pertenece a " + a +" es = " + c);

	}

}
