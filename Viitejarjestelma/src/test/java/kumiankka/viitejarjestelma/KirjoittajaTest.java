/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kumiankka.viitejarjestelma;

import kumiankka.viitejarjestelma.Kirjoittaja;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jeuro
 */
public class KirjoittajaTest {
    Kirjoittaja k;
    
    public KirjoittajaTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
     @Test
     public void tyhjaKonstruktoriToimii() {
         k = new Kirjoittaja();
         
         assertNotNull(k);
     }
     
     @Test
     public void konstruktoriToimii() {
         k = new Kirjoittaja("Matti", "Luukkainen");
         
         assertNotNull(k);
     }
     
     @Test
     public void ihmiselleLuetavaToString() {
         k = new Kirjoittaja("Matti", "Luukkainen");
         
         assertEquals("M. Luukkainen", k.toString());
     }
}
