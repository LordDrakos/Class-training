/**
 * Created by adn on 10/01/17.
 */
public class Alarma {
    int Temp = 0;
    int Max = 100;

    public void getTemp(int Temperatura){
        Temp = Temperatura;
    }

    public int darTemp(){
        return Temp;
    }

    public boolean Comprobar(){
        if (Temp >= Max){
            return true;
        }
        return false;
    }
}
