/**
 * Created by adn on 24/01/17.
 */
public class Alumnos  extends Personas{
    private String CIAL,ciclo;

    public void setCIAL(String cial){
        this.CIAL = cial;
    }

    public void setRama(String curso){
        this.ciclo = curso;
    }

    public String getCIAL(){
        return CIAL;
    }
    public String getRama(){
        return ciclo;
    }
}
