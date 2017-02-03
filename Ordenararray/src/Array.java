import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by adn on 16/01/17.
 */
public class Array {

    public static void main(String[] args) {
        int[] ej = new int[8];
        int[] aux = new int[8];
        int ayuda = 0;
        Random r = new Random();

        for (int rr = 0; rr < ej.length; rr++) {
            ej[rr] = r.nextInt(100);
        }

        System.out.print("Añada 8 valores");
        for (int i = 0; i < ej.length; i++) {
            for (int c = i + 1; c < ej.length; c++) {
                if (ej[c] < ej[i]) {
                    ayuda = ej[i];
                    ej[i] = ej[c];
                    ej[c] = ayuda;
                }


            }
        }
        System.out.print(Arrays.toString(ej));
    }
}
