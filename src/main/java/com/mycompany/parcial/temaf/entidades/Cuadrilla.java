/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial.temaf.entidades;

import java.util.ArrayList;

/**
 *
 * @author Blas
 */
public class Cuadrilla {

    private int numero;
    private int cant_trabajadores;
    private String equipamiento;
    private String materiales;

    private ArrayList<Trabajador> trabajadores;

    public Cuadrilla(int numero, String equipamiento, String materiales) {
        this.numero = numero;
        this.equipamiento = equipamiento;
        this.materiales = materiales;
        this.trabajadores = new ArrayList<>();
        this.cant_trabajadores = 0;
    }

    public void agregarTrabajador(Trabajador trabajador) {
        if (this.trabajadores.size() < 3) {
            this.trabajadores.add(trabajador);
            trabajador.setEstado("ocupado");
            this.cant_trabajadores = this.trabajadores.size();
        } else {
            System.out.println("La cuadrilla " + this.numero + " ya está completa.");
        }
    }

    public void liberarCuadrilla() {
        for (Trabajador t : trabajadores) {
            t.setEstado("libre");
        }
        System.out.println("Los trabajadores de la cuadrilla " + this.numero + " han sido liberados.");
    }

    public boolean estaLibre() {
        if (trabajadores.isEmpty()) {
            return false;
        }
        for (Trabajador t : trabajadores) {
            if (t.getEstado().equals("ocupado")) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Trabajador> getTrabajadores() {
        return this.trabajadores;
    }

    public int getNumero() {
        return this.numero;
    }
}
