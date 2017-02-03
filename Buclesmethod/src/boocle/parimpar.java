package boocle;

import java.util.Random;

/**
 * Created by adn on 10/01/17.
 */
public class parimpar{


        public static void main(String[]args){

            Random rand = new Random();

           for(int i=0;i<10;i++){
               int a = rand.nextInt(200)+1;
               parimpar(a);
           }
}

    private static void parimpar(int a) {
        if (a%2==0){
            System.out.println(a+" Es par");
     }else{System.out.println(a+ " Es impar");}
    }
}
