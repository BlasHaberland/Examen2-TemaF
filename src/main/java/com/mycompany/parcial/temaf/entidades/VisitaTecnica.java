/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial.temaf.entidades;

/**
 *
 * @author Blas
 */
public class VisitaTecnica {

    private int numero;
    private String ubicacion;
    private String tamano;
    private String fecha_creacion;
    private String fecha_reparacion;
    private String fecha_final_obra;
    private String observaciones;

    private Cuadrilla cuadrillaAsignada;

    public VisitaTecnica(int numero, String ubicacion, String tamano, String fecha_creacion) {
        this.numero = numero;
        this.ubicacion = ubicacion;
        this.tamano = tamano;
        this.fecha_creacion = fecha_creacion;
    }
}
