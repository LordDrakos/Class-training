import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner calculo = new Scanner(System.in);
		int n1, n2, opcion, resultado;
		System.out.println("Bienvenido a la calculadora de Antonio Djigo");
		System.out.println("Introduzca los dos números con los que desea operar");
		n1 = calculo.nextInt();
		n2 = calculo.nextInt();
		System.out.println("Escriba la operación que desea realizar: \n >> 1 Sumar \n >> 2- Restar \n >> 3- Multiplicar \n >> 4- Dividir");
		opcion = calculo.nextInt();
		
		switch (opcion) {
		 
        case 1:
        resultado = (n1 + n2);
        System.out.println("El resultado de la suma es " + resultado);
        break;
 
        case 2:
        	resultado = (n1 - n2);
        System.out.println("El resultado de la resta es " + resultado);
        break;
        
        case 3:
        	resultado = (n1 * n2);
        System.out.println("El resultado de la multiplicación es " + resultado);
            break;
            
        case 4:
        	resultado = (n1 / n2);
        System.out.println("El resultado de la división es " + resultado);
            break;
        
  
 }
	
	}

}
