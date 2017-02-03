import java.util.Scanner;

public class sumaforwhiledo {

	public static void main(String[] args) {
		
		int totsum = 0;
		int valor;
		Scanner calculo = new Scanner(System.in);
		
		do{
			System.out.println("Introduzca un número a sumar");
			valor = calculo.nextInt();
			if(valor != 0){
				totsum= valor + totsum;	
			}
			if(valor == 0){
				System.out.println("La suma de todos los valores introducidos es " + totsum );
			}
				
		}
		while( valor != 0 );
	}

}
