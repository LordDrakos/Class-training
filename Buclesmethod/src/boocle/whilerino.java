package boocle;

/**
 * Created by adn on 10/01/17.
 */
public class whilerino {

    public static void main(String[]args){
        int a = 1;

        while (a<300){

            whilerin(a);
            a++;
        }
    }

    private static void whilerin(int a) {
        if (a%5!=0){
            System.out.println("Numero es "+a);

        }
    }
}
