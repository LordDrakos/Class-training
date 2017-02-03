import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by adn on 12/01/17.
 */
public class rra {

    public static void main (String[]args){

        int[]alumnos = new int[4];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<alumnos.length; i++){
            System.out.print("Introduzca alumno");
            int alum = sc.nextInt();
            alumnos[i]=alum;



        }
        System.out.print("Alumnos = " + Arrays.toString(alumnos));


    }
}
