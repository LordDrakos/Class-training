package boocle;

/**
 * Created by adn on 10/01/17.
 */
public class dowhilerino {

    public static void main(String[]args){
        int a = 1;

        dowhil(a);
    }

    private static void dowhil(int a) {
        do {

            if (a%5!=0){
                System.out.println("Numero es "+a);

            }
            a++;
        }while (a<300);
    }
}
