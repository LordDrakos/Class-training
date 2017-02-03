import java.util.Scanner;

public class parimpar {

	public static void main(String[] args) {
		Scanner calculo = new Scanner(System.in);
		int n;
		System.out.println("Bienvenido al calculador de pares o nones de Antonio Djigo");
		
		System.out.println("Introduzca el número a calcular");
		n = calculo.nextInt();
		
		   if(n%2==0){
	             System.out.println(n+" es par");
	        }else{
	            System.out.println(n+" es impar");
	        }    

	}

}