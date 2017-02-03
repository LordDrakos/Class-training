/**
 * Created by adn on 17/01/17.
 */
package ut6;

public class Parametros {

    public static void valor(int a){
        a++;
    }

    public static void param(int[] b){
        b[0]++;
    }

    public static void main(String[] args) {

        int[] vector1={5};
        int[] vector2={5};


        valor(vector1[0]); //paso por valor
        param(vector2); //paso por par�metro

        System.out.println("vector1 vale: "+ vector1[0]);
        System.out.println(" y el contenido del vector2 es: "+vector2[0]);


    }

}
