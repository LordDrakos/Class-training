/**
 * Created by ADN on 14/01/2017.
 */
import static org.junit.Assert.assertTrue;
import org.junit.Before; import org.junit.Test;

public class StringTest {
    public Strings teststring;
    @Before  public void antesDelTest() {

        teststring = new Strings ();
    }

    @Test public void TestVacio() {
        String sino = teststring.TestVacio();
        teststring = new Strings (sino);
        assertTrue(sino = "");
    }




    @Test public void testBlancoInicio() {
        boolean sino = teststring.testBlancoInicio();
        assertTrue(sino == true);
    }
    @Test public void testBlancoFin() {
        boolean sino = teststring.testBlancoFin();
        assertTrue(sino == true);
    }
    @Test public void testOne(){
        boolean sino = teststring.testOne();
        assertTrue(sino == true);}

    @Test public void testTamaños(){
        boolean sino = teststring.testTamaños();
        assertTrue(sino == true);;
    }
    @Test public void  TestMayus(){
        boolean sino = teststring.TestMayus();
        assertTrue(sino == true);
    }

}