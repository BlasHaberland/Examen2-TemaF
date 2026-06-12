/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import com.mycompany.parcial.temaf.entidades.Documento;
import com.mycompany.parcial.temaf.entidades.Modem;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Blas
 */
public class modemTest {

    private Modem modemTest;

    @Before
    public void setUp() {
        modemTest = new Modem("SN-1234", "Motorola", "1000Mbps", 4, 1, "TCP/IP", 6, true);
    }

    @Test
    public void testExisteDocRefaccion() {
        assertNotNull("Fallo la composición: El documento de refacción es null", modemTest.getDocRefaccion());
    }

    @Test
    public void testDatosDocRefaccion() {
        Documento doc = modemTest.getDocRefaccion();
        assertEquals("Refacción de hardware", doc.getTipo());
        assertEquals("1.0", doc.getVersion());
    }

    @Test
    public void testExisteDocDrivers() {
        assertNotNull("Fallo la composición: El documento de drivers es null", modemTest.getDocDrivers());
    }

    @Test
    public void testDatosDocDrivers() {
        Documento doc = modemTest.getDocDrivers();
        assertEquals("drivers y software", doc.getTipo());
        assertEquals("1.0", doc.getVersion());
    }
}
