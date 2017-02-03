import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * Created by adn on 24/01/17.
 */


public class Personas {
    private String Nombre;
    private String DNI;
    private LocalDate fnac;


    public void setName(String name){
        this.Nombre = name;
    }
    public String getName(){
        return Nombre;
    }

    public void setDNI (String dni){
        this.DNI = dni;
    }

    public String getDNI(){
        return DNI;
    }



    public LocalDate getFnac() {
        return fnac;
    }

    public void setFnac(LocalDate fnac) {
        this.fnac = fnac;
    }

    public int edad(LocalDate vf) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate hoy = LocalDate.now();

        Period periodo = Period.between(vf, hoy);
        return periodo.getYears();
    }

}


