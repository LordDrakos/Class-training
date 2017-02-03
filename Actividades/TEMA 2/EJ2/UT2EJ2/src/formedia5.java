import java.util.Scanner;
public class formedia5 {

	public static void main(String[] args) {
		Scanner calculo = new Scanner (System.in);
		int valor;
		int sumamedia = 0;
		double media;
		
		for (int i = 0 ; i < 5 ; i++){
			
			System.out.println("Introduzca las cinco notas una a una: ");
			valor = calculo.nextInt();
			sumamedia = valor + sumamedia;		
			
		}
		media = sumamedia / 5;
		System.out.println("La media del alumno es de " + media );

	}

}
