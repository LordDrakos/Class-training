import java.util.Scanner;

public class sueldo {

	public static void main(String[] args) {
		
	
		Scanner calculo = new Scanner(System.in);
		int  sph = 15;
		int  horas, sueldo;
		
		System.out.println("Bienvenido al calculador de sueldos de Antonio Djigo:");
		
		System.out.println("Introduzca las horas trabajadas:");
		horas = calculo.nextInt();
		
		sueldo = (horas * sph);
		
		System.out.println(" El trabajador cobrará en total €" + sueldo);

	}

}