/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial.temaf.entidades;

/**
 *
 * @author Blas
 */
public class Documento {

    private String tipo;
    private String version;
    private String fecha_actualizacion;

    public Documento(String tipo, String version) {
        this.tipo = tipo;
        this.version = version;
    }

    //Getters que podria usar
    public String getTipo() {
        return tipo;
    }

    public String getVersion() {
        return version;
    }
}
