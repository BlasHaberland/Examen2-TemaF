/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import com.mycompany.parcial.temaf.entidades.Abonado;
import java.util.Arrays;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Blas
 */
@RunWith(value = Parameterized.class)
public class parameterABOTest {

    private String emailAProbar;
    private boolean resultadoEsperado;

    public parameterABOTest(String emailAProbar, boolean resultadoEsperado) {
        this.emailAProbar = emailAProbar;
        this.resultadoEsperado = resultadoEsperado;
    }

    // Datos dee preueba
    @Parameters
    public static Iterable<Object[]> tomarDatos() {
        return Arrays.asList(new Object[][]{
            {"juan@mail.com", true},
            {"correo_sin_arroba.com", false},
            {"correo@sinpunto", false},
            {"no se puede mail con espasios@gmail.com", false},
            {"abonado.ok@cctve.com.ar", true}
        });
    }

    @Test
    public void testValidarEmail() {
        boolean resultadoReal = Abonado.ValidarMail(this.emailAProbar);

        assertEquals("Fallo evaluando el email: " + this.emailAProbar, this.resultadoEsperado, resultadoReal);
    }
}
