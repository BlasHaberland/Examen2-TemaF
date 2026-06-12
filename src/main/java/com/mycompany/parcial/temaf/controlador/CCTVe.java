/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial.temaf.controlador;

import com.mycompany.parcial.temaf.entidades.Abonado;
import com.mycompany.parcial.temaf.entidades.Cuadrilla;
import com.mycompany.parcial.temaf.entidades.SolicitudArreglo;
import com.mycompany.parcial.temaf.entidades.Trabajador;
import java.util.ArrayList;

/**
 *
 * @author Blas
 */
public class CCTVe {

    private String nombre = "San Luis CCTVe";

    private ArrayList<Abonado> listaAbonados;
    private ArrayList<SolicitudArreglo> listaSolicitudes;
    private ArrayList<Cuadrilla> listaCuadrillas;

    public CCTVe() {
        this.listaAbonados = new ArrayList<>();
        this.listaSolicitudes = new ArrayList<>();
        this.listaCuadrillas = new ArrayList<>();
    }

    //AGREGO A LAS LISTAS
    public void registrarAbonado(Abonado a) {
        listaAbonados.add(a);
    }

    public void registrarSolicitud(SolicitudArreglo s) {
        listaSolicitudes.add(s);
    }

    public void registrarCuadrilla(Cuadrilla c) {
        listaCuadrillas.add(c);
    }

//ABONADOS
    public void listadoAbonados() {
        System.out.println("\n=== LISTADO DE ABONADOS ===");
        if (listaAbonados.isEmpty()) {
            System.out.println("No hay abonados registrados.");
        }
        for (Abonado a : listaAbonados) {
            System.out.println("- Nombre: " + a.getNombre() + " | Contacto: " + a.getMail());
        }
    }

//CUADRILLA
    public void visitasPorCuadrilla() {
        System.out.println("\n=== VISITAS ASIGNADAS POR CUADRILLA ===");
        for (SolicitudArreglo s : listaSolicitudes) {
            if (s.getVisita() != null && s.getVisita().getCuadrillaAsignada() != null) {
                System.out.println("- Cuadrilla Nro " + s.getVisita().getCuadrillaAsignada().getNumero()
                        + " -> Visita a " + s.getVisita().getUbicacion());
            }
        }
    }

    public void informeCuadrillasOciosas() {
        System.out.println("\n=== CUADRILLAS OCIOSAS (DISPONIBLES) ===");
        for (Cuadrilla c : listaCuadrillas) {
            if (c.estaLibre()) {
                System.out.println("- Cuadrilla Nro " + c.getNumero() + " esta libre y lista para trabajar.");
            }
        }
    }

    public void trabajadoresPorCuadrilla() {
        System.out.println("\n=== TRABAJADORES POR CUADRILLA ===");
        for (Cuadrilla c : listaCuadrillas) {
            System.out.println("Cuadrilla Nro " + c.getNumero() + ":");
            for (Trabajador t : c.getTrabajadores()) {
                System.out.println("  -> " + t.getNombre() + " (" + t.getPuesto() + ") - Estado: " + t.getEstado());
            }
        }
    }

//OTROS
    public void informesSolicitudesPorMarca(String marcaBuscada) {
        System.out.println("\n=== SOLICITUDES DE MODEMS MARCA: " + marcaBuscada.toUpperCase() + " ===");
        for (SolicitudArreglo s : listaSolicitudes) {
            if (s.getModemRoto() != null && s.getModemRoto().getMarca().equalsIgnoreCase(marcaBuscada)) {
                System.out.println("- Solicitud ID: " + s.getCodinf() + " | Problema: " + s.getProblema());
            }
        }
    }

    public void solicitudesSinVisita() {
        System.out.println("\n=== SOLICITUDES PENDIENTES DE VISITA ===");
        for (SolicitudArreglo s : listaSolicitudes) {
            if (s.getVisita() == null) {
                System.out.println("- Solicitud ID: " + s.getCodinf() + " | Prioridad: " + s.getPrioridad());
            }
        }
    }
}
