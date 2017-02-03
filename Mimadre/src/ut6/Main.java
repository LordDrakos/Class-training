/**
 * Created by adn on 17/01/17.
 */
package ut6;

public class Main{

    public static void main(String[] args) {
        cuadrado cuad1=new  cuadrado(5);
        cuadrado cuad2=new  cuadrado(5);
        cuadrado cuad3=new  cuadrado(8);
        cuadrado cuad4=cuad1;

        if (cuad1.equals(cuad2)) System.out.println("el 1 y el 2 son iguales");
        else System.out.println("el 1 y el 2 NO son iguales");

        if (cuad1.equals(cuad3)) System.out.println("el 1 y el 3 son iguales");
        else System.out.println("el 1 y el 3 NO son iguales");

        if (cuad1.equals(cuad4)) System.out.println("el 1 y el 4 son iguales");
        else System.out.println("el 1 y el 4 NO son iguales");

        System.out.println("el 1 "+ cuad1.toString());
        System.out.println("el 2 "+ cuad2.toString());
        System.out.println("el 3 "+ cuad3.toString());
        System.out.println("el 4 "+ cuad4.toString());

    }

}
