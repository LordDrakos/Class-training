import java.util.Scanner;
public class Contadorpositivo {

	public static void main(String[] args) {
		Scanner calculo = new Scanner(System.in);
		int npositivo = 0;
		int num;
		System.out.println("A continuación calcularemos cuantos nº positivos introduce");
		do{
			System.out.println("Introduzca un número");
			num = calculo.nextInt();
			if (num >= 0){
				npositivo ++;
			}
			if (num < 0){
				System.out.println("Ha introducido un total de " + npositivo +". Saliendo del programa");
			}
			
		}
		while(num >= 0);

	}

}
