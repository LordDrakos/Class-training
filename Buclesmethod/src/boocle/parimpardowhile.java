package boocle;

import java.util.Random;

/**
 * Created by adn on 10/01/17.
 */
public class parimpardowhile {
    public static void main(String[] args) {
        Random rand = new Random();
        int i = 0;

        parimpar(rand, i);
    }

    private static void parimpar(Random rand, int i) {
        do {


            int a = rand.nextInt(200) + 1;
            if (a % 2 == 0) {
                System.out.println(a + " Es par");
            } else {
                System.out.println(a + " Es impar");
            }
            i++;
        } while (i < 10);
    }
}