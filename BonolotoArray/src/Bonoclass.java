import java.util.Random;

/**
 * Created by adn on 17/01/17.
 */
public class Bonoclass {

    public int getSorteo() {

        int[] aleatorio;
        aleatorio = new int[8];
        Random r = new Random();

        for (int i = 0; i < aleatorio.length; i++) {
            aleatorio[i] = r.nextInt(49) + 1;
            for (int x = 8; x < 0; x--) {
                if (aleatorio[i] == aleatorio[i - 1]) {
                    aleatorio[i] = r.nextInt(49) + 1;
                }


            }
            if(aleatorio[i]==7){aleatorio[i] = r.nextInt(9)+1;}
            return aleatorio[i];
        }


        return 0;

    }


}

