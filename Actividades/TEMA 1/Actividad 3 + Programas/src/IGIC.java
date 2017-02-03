import java.util.Scanner;

public class IGIC {

	public static void main(String[] args) {
		Scanner calculo = new Scanner(System.in);
		double pvp, preciofinal, igic;
		
		System.out.println("Bienvenido a la calculadora de precios canarios de Antonio Djigo");
		System.out.println("Introduzca el PvP del objeto a calcular");
		pvp = calculo.nextDouble();
		igic = (pvp*7)/100;
		System.out.println("El impuesto a cobrar es de €" + igic);
		preciofinal = (pvp + igic);
		System.out.println("El precio final es de €" + preciofinal);	

	}

}
