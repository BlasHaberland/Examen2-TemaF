/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import org.junit.BeforeClass;

import com.mycompany.parcial.temaf.entidades.Abonado;
import java.time.LocalDate;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotSame;
import static junit.framework.Assert.assertTrue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Blas
 */
public class abonadoTest {

    static Abonado ciu;
    static int i = 1;

    @BeforeClass
    public static void antesDeTodo() {
        ciu = new Abonado("Anonimus", 1212);
        System.out.println("INGRESO de abonado del bien");
    }

    @AfterClass
    public static void despuesDeTodo() {
        LocalDate ayer = LocalDate.now().minusDays(1);
        System.out.println(ayer + " Modem rotos reparados, Abonados Felices");
    }

    @Before
    public void setUp() {
        System.out.println("-------------------------------------------------");
        System.out.println("Iniciando Test nro: " + i);
    }

    @After
    public void tearDown() {
        System.out.println("-------------------------------------------------");
        i++;
    }

    //TESTS
    @Test
    public void testValidarPsw() {
        int contra = 123456;
        System.out.println("Test Validar contrasena");
        assertTrue(ciu.validarIngreso(contra));
    }

    @Test
    public void testValidarEmail() {
        System.out.println("Test Validar email");
        String email = "abc@dominio.com";
        boolean tieneArroba = email.contains("@");
        boolean tienePunto = email.contains(".");
        boolean longitudValida = email.length() < 20;

        assertTrue(tieneArroba && tienePunto && longitudValida);
    }

    @Test
    public void TestCambioPass() {
        System.out.println("Test Cambio contrasena");
        String newPass = "1234";
        ciu.cambioPassword(newPass);

        assertEquals(1234, ciu.getContrasena());
        System.out.println("Nuevo Pass> " + ciu.getContrasena());
    }

    @Test(timeout = 30)
    public void testDelay() throws InterruptedException {
        System.out.println("Test delay");
        ciu.delay(45);
    }

    @Test
    public void testAbonadosDiferentes() {
        System.out.println("Test Abonados diferentes");
        Abonado c1 = new Abonado("Juan", 1111);
        Abonado c2 = new Abonado("Pedro", 2222);

        assertNotSame("misma persona", c1, c2);
    }
}
