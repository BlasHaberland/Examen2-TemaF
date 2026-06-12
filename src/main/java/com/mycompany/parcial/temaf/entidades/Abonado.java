/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial.temaf.entidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Blas
 */
public class Abonado {

    private String nombre;
    private String celular;
    private String mail;
    private String calleA;
    private String calleB;
    private int altura;
    private String barrio;
    private boolean debito_automatico;
    private int contrasena;

    public Abonado() {
    }

    public Abonado(String nombre, int contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    //METODOS
    public boolean validarIngreso(int contrasena) {
        return this.contrasena == contrasena;
    }

    public void cambioPassword(String nuevaContrasena) {
        this.contrasena = Integer.parseInt(nuevaContrasena);
    }

    public void delay(int mili) {
        try {
            Thread.sleep(mili);
        } catch (InterruptedException e) {
            System.out.println("Delay de " + mili + " milisegundos");
        }
    }

    public boolean abonadosDiferentes(Abonado c2) {
        return this != c2;
    }

    public static boolean ValidarMail(String email) {
        String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }

    //GETTERS QUE NECESITO
    public int getContrasena() {
        return this.contrasena;
    }
}
