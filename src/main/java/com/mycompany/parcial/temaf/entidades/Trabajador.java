/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial.temaf.entidades;

/**
 *
 * @author Blas
 */
public class Trabajador {

    protected String id;
    protected String nombre;
    protected String puesto;
    protected String estado;

    public Trabajador(String id, String nombre, String puesto) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.estado = "libre";
    }

    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getEstado() {
        return this.estado;
    }

}
