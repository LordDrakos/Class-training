/**
 * Created by adn on 24/01/17.
 */
public class Profesores extends Personas {
    private int NRP;
    private String espec,destino;


    public void setNRP(int nrp){
        this.NRP = nrp;
    }

    public void setESP(String especialidad){
        this.espec = especialidad;
    }

    public void setDestino(String instituto){
        this.destino = instituto;
    }

    public int getNRP(){
        return NRP;
    }

    public String getESP(){
        return espec;
    }

    public String getDestino(){
        return destino;
    }

}

