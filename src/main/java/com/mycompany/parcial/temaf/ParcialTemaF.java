/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.parcial.temaf;

import com.mycompany.parcial.temaf.controlador.CCTVe;
import com.mycompany.parcial.temaf.entidades.Abonado;
import com.mycompany.parcial.temaf.entidades.Cuadrilla;
import com.mycompany.parcial.temaf.entidades.Lider;
import com.mycompany.parcial.temaf.entidades.Modem;
import com.mycompany.parcial.temaf.entidades.SolicitudArreglo;
import com.mycompany.parcial.temaf.entidades.Trabajador;
import com.mycompany.parcial.temaf.entidades.VisitaTecnica;

/**
 *
 * @author Blas
 */
public class ParcialTemaF {

    public static void main(String[] args) {
        // 1. Inicializamos el sistema central
        CCTVe sistema = new CCTVe();
        System.out.println("--- INICIANDO SISTEMA SAN LUIS CCTVe ---");

        // 2. Creamos abonados de prueba
        Abonado cliente1 = new Abonado("Blas", 1234);
        Abonado cliente2 = new Abonado("Maria", 5678);
        cliente1.setMail("blas@ulp.edu.ar");
        cliente2.setMail("maria@mail.com");
        sistema.registrarAbonado(cliente1);
        sistema.registrarAbonado(cliente2);

        // 3. Creamos módems
        Modem modem1 = new Modem("SN-001", "Cisco", "300Mbps", 4, 1, "TCP/IP", 5, true);
        Modem modem2 = new Modem("SN-002", "Motorola", "500Mbps", 4, 1, "TCP/IP", 4, true);

        // 4. Creamos el personal técnico
        Lider lider1 = new Lider("L-01", "Carlos");
        Trabajador tech1 = new Trabajador("T-01", "Ana", "Tecnico en Fibra");
        Trabajador tech2 = new Trabajador("T-02", "Pedro", "Ayudante");
        Trabajador tech3 = new Trabajador("T-03", "Luis", "Tecnico Libre");

        // 5. Armamos las cuadrillas
        Cuadrilla cuadrilla1 = new Cuadrilla(101, "Camioneta Kangoo", "Escalera, Fibra, Herramientas");
        cuadrilla1.agregarTrabajador(lider1);
        cuadrilla1.agregarTrabajador(tech1);
        cuadrilla1.agregarTrabajador(tech2);

        Cuadrilla cuadrilla2 = new Cuadrilla(102, "Camioneta Fiorino", "Escalera, Repuestos");
        cuadrilla2.agregarTrabajador(tech3);
        cuadrilla2.liberarCuadrilla();

        sistema.registrarCuadrilla(cuadrilla1);
        sistema.registrarCuadrilla(cuadrilla2);

        // 6. Generamos Solicitudes de Arreglo
        SolicitudArreglo solicitud1 = new SolicitudArreglo("REQ-1001", "12/06/2026", "Sin conexion a internet", "ALTA", 1);
        solicitud1.asociarAbonado(cliente1);
        solicitud1.asociarModem(modem1);

        SolicitudArreglo solicitud2 = new SolicitudArreglo("REQ-1002", "12/06/2026", "Luz roja parpadeando", "MEDIA", 3);
        solicitud2.asociarAbonado(cliente2);
        solicitud2.asociarModem(modem2);

        // 7. Creamos y asignamos una Visita Técnica solo a la primera solicitud
        VisitaTecnica visita1 = new VisitaTecnica(5001, "Centro San Luis", "Hogar", "12/06/2026");
        visita1.asignarCuadrilla(cuadrilla1);
        solicitud1.asignarVisita(visita1);

        sistema.registrarSolicitud(solicitud1);
        sistema.registrarSolicitud(solicitud2);

        // =====================================================================
        // 8. EJECUCIÓN DE LOS REPORTES GERENCIALES
        // =====================================================================
        System.out.println("\n\n>>> GENERANDO REPORTES GERENCIALES <<<");

        sistema.listadoAbonados();
        sistema.informesSolicitudesPorMarca("Cisco");
        sistema.informeCuadrillasOciosas();
        sistema.visitasPorCuadrilla();
        sistema.solicitudesSinVisita();
        sistema.trabajadoresPorCuadrilla();
    }
}
