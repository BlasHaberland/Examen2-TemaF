/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import com.mycompany.parcial.temaf.entidades.Cuadrilla;
import com.mycompany.parcial.temaf.entidades.Lider;
import com.mycompany.parcial.temaf.entidades.Trabajador;
import static junit.framework.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Blas
 */
public class equipoTest {

    private Trabajador empleadoNormal;
    private Lider liderEquipo;
    private Cuadrilla cuadrillaTest;

    @Before
    public void setUp() {
        empleadoNormal = new Trabajador("T-001", "Carlos", "Técnico Cableado");
        liderEquipo = new Lider("L-001", "Ana");
        cuadrillaTest = new Cuadrilla(101, "Camioneta Ford", "Cables, Fibra, Herramientas");
    }

    @Test
    public void testEstadoInicialTrabajador() {
        assertEquals("libre", empleadoNormal.getEstado());
    }

    @Test
    public void testHerenciaLider() {
        assertEquals("Ana", liderEquipo.getNombre());
        assertEquals("libre", liderEquipo.getEstado());
    }

    @Test
    public void testAgregarTrabajadorACuadrilla() {
        cuadrillaTest.agregarTrabajador(empleadoNormal);
        assertEquals("ocupado", empleadoNormal.getEstado());
    }

    @Test
    public void testLiberarCuadrilla() {

        cuadrillaTest.agregarTrabajador(empleadoNormal);
        cuadrillaTest.agregarTrabajador(liderEquipo);

        cuadrillaTest.liberarCuadrilla();

        assertEquals("libre", empleadoNormal.getEstado());
        assertEquals("libre", liderEquipo.getEstado());
    }
}
