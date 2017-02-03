/**
 * Created by ADN on 14/01/2017.
 */
public class Strings{
    private String sino="";

        public Strings(String sino){
        this.sino=sino;
    }

        public String TestVacio(){
             String frase = "Verano";
            String reverse = "";
            for ( int i = frase.length() - 1; i >= 0; i-- ){
                 reverse = frase + reverse.charAt(i);}
            return reverse;
    }

}
