package boocle;

import java.util.Scanner;

/**
 * Created by adn on 10/01/17.
 */
public class asidecredowhile {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca caracter");
        int a = teclado.nextInt();
        ascidecdowhile(a);


    }

    private static void ascidecdowhile(int a) {
        do {
            char b = (char) a;
            System.out.print("Caracter = "+b+"\n");
            a-=4;
        }while (a > 0);
    }

}

