/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial.temaf.entidades;

/**
 *
 * @author Blas
 */
public class Modem {

    private String serial_number;
    private String marca;
    private String velocidad;
    private int puertos_ethernet;
    private int puerto_coaxial;
    private String protocolo_red;
    private int nro_LEDS;
    private boolean firewall;
    private String estado;

    private Documento docRefaccion;
    private Documento docDrivers;

    public Modem(String serial_number, String marca, String velocidad, int puertos_ethernet,
            int puerto_coaxial, String protocolo_red, int nro_LEDS, boolean firewall) {

        this.serial_number = serial_number;
        this.marca = marca;
        this.velocidad = velocidad;
        this.puertos_ethernet = puertos_ethernet;
        this.puerto_coaxial = puerto_coaxial;
        this.protocolo_red = protocolo_red;
        this.nro_LEDS = nro_LEDS;
        this.firewall = firewall;
        this.estado = "roto";

        this.docRefaccion = new Documento("Refacción de hardware", "1.0");
        this.docDrivers = new Documento("drivers y software", "1.0");
    }

    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("El estado del módem " + this.serial_number + " ahora es: " + this.estado);
    }

    //Para testear
    public Documento getDocRefaccion() {
        return this.docRefaccion;
    }

    public Documento getDocDrivers() {
        return this.docDrivers;
    }

    //GETERS QUE NECESITO
    public String getMarca() {
        return this.marca;
    }
}
