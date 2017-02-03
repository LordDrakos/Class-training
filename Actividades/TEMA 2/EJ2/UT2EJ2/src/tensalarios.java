import java.util.Scanner;
public class tensalarios {

	public static void main(String[] args) {
		Scanner calculo = new Scanner (System.in);
		int salariosaltos = 0;
		int salario, sumasalario = 0;
		double mediasalario;
		
for (int i = 0 ; i < 10 ; i++){
			
			System.out.println("Introduzca los diez salarios uno a uno: ");
			salario = calculo.nextInt();
			sumasalario = salario + sumasalario;		
			
			if (salario > 1500){
				sumasalario = sumasalario + 1;
			}
			
		}
		mediasalario = sumasalario / 10;
		System.out.println("La media de los salarios es de " + mediasalario );


	}

}
