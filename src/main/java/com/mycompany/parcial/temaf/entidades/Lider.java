/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial.temaf.entidades;

/**
 *
 * @author Blas
 */
public class Lider extends Trabajador {

    public Lider(String id, String nombre) {
        super(id, nombre, "Lider de Cuadrilla");
    }

    public void cargarFechaFinal(String fecha) {
        System.out.println("El lider " + this.nombre + " cargo la fecha final de obra: " + fecha);
    }

    public void cargarReparacion(String detalles, String hora) {
        System.out.println("El lider " + this.nombre + " reporto la reparacion: " + detalles + " a las " + hora);
    }
}
