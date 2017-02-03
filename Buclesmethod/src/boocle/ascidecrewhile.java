package boocle;

import java.util.Scanner;

/**
 * Created by adn on 10/01/17.
 */
public class ascidecrewhile {

    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca caracter");
        int a = teclado.nextInt();
        asidecrwhile(a);


    }

    private static void asidecrwhile(int a) {
        while (a > 0){
            char b = (char) a;
            System.out.print("Caracter = "+b+"\n");
            a-=4;
        }
    }

}

