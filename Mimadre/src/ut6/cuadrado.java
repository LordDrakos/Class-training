/**
 * Created by adn on 17/01/17.
 */
package ut6;


public class cuadrado extends Main{

    private int base;
    private String nombre;

    public cuadrado(int b) {
        this.nombre="Cuadrado";
        this.base=b;
    }

    public double area(){
        return (base*base);
    }
    public double perimetro(){
        return(4*base);
    }


}
