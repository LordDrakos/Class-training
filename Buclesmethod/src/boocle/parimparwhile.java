package boocle;

import java.util.Random;

/**
 * Created by adn on 10/01/17.
 */
public class parimparwhile {
    public static void main(String[]args){
    Random rand = new Random();
    int i = 0;

        parimparwhile(rand, i);
    }

    private static void parimparwhile(Random rand, int i) {
        while(i<10){
         int a = rand.nextInt(200)+1;
             if (a%2==0){
          System.out.println(a+" Es par");
         }else{System.out.println(a+ " Es impar");}
            i++;
 }
    }
}
