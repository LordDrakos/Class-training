import java.awt.*;
import java.util.Random;

/**
 * Created by adn on 10/01/17.
 */
public class Timbre {

    public static void main(String[] args) {
        Alarma sonido = new Alarma();
        Random rand = new Random();

        boolean Estado = false;
        int Temperatura = rand.nextInt(200) + 1;
        sonido.getTemp(Temperatura);
        System.out.println("La temperatura es de "+sonido.darTemp());
        if (sonido.Comprobar()==true) {
            System.out.print("ESTA SONANDO LA ALARMA");
        } else {
            System.out.print("La alarma está apagada");

        }
    }
}