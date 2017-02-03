package boocle;

import java.util.Scanner;

/**
 * Created by adn on 10/01/17.
 */
public class ascidecre {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca caracter");
        int a = teclado.nextInt();
        asidecrfor(a);

    }

    private static void asidecrfor(int a) {
        for (int i=a;i>0;i-=4){
            char b = (char) i;
            System.out.print("Caracter = "+b+"\n");
        }
    }
}
