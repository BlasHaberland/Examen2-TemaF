/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import com.mycompany.parcial.temaf.entidades.Cuadrilla;
import com.mycompany.parcial.temaf.entidades.Modem;
import com.mycompany.parcial.temaf.entidades.SolicitudArreglo;
import com.mycompany.parcial.temaf.entidades.Trabajador;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Blas
 */
public class sistemaTest {

    private Cuadrilla cuadrillaTest;
    private Trabajador tecnicoTest;
    private SolicitudArreglo solicitudTest;
    private Modem modemTest;

    @Before
    public void setUp() {
        cuadrillaTest = new Cuadrilla(999, "Camioneta Test", "Herramientas");
        tecnicoTest = new Trabajador("T-99", "Prueba", "Tester");
        solicitudTest = new SolicitudArreglo("REQ-TEST", "12/06/2026", "Falla de red", "ALTA", 1);
        modemTest = new Modem("SN-TEST", "Cisco", "100Mbps", 4, 1, "TCP/IP", 4, true);
    }

    @Test
    public void testAsociarModemASolicitud() {
        solicitudTest.asociarModem(modemTest);
        assertNotNull("La solicitud debe tener un módem asociado", solicitudTest.getModemRoto());
        assertEquals("Cisco", solicitudTest.getModemRoto().getMarca());
    }

    @Test
    public void testCuadrillaSeOcupaAlAgregarTrabajador() {
        cuadrillaTest.agregarTrabajador(tecnicoTest);
        assertFalse("La cuadrilla debería estar OCUPADA", cuadrillaTest.estaLibre());
    }

    @Test
    public void testLiberarCuadrillaVuelveAOciosa() {
        cuadrillaTest.agregarTrabajador(tecnicoTest);

        cuadrillaTest.liberarCuadrilla();

        assertTrue("La cuadrilla debería estar LIBRE (Ociosa) tras liberarla", cuadrillaTest.estaLibre());
        assertEquals("libre", tecnicoTest.getEstado());
    }
}
