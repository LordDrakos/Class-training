
public class sueldomin {

	public static void main(String[] args) {
		double aumento, salariofinal;
		System.out.println("Vamos a calcular el aumento del salario mínimo interprofesional en 2016");
		double salario = 655.20;
		System.out.println("El salario actual es de " + salario +" euros ");
		aumento = (0.25*salario)/100;
		salariofinal = salario + aumento;
		System.out.println("El aumento del salario será de " + aumento + " llegando a un total de " + salariofinal +" euros");
		
	}

}
