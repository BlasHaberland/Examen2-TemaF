/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial.temaf.entidades;

/**
 *
 * @author Blas
 */
public class SolicitudArreglo {

    private String codinf;
    private String fecha_informe;
    private String problema;
    private String codigo_urgencia;
    private int prioridad;

    private Modem modemRoto;
    private Abonado informante;
    private VisitaTecnica visita;

    public SolicitudArreglo(String codinf, String fecha_informe, String problema, String codigo_urgencia, int prioridad) {
        this.codinf = codinf;
        this.fecha_informe = fecha_informe;
        this.problema = problema;
        this.codigo_urgencia = codigo_urgencia;
        this.prioridad = prioridad;
        this.visita = null;
    }

    public void asociarModem(Modem m) {
        this.modemRoto = m;
    }

    public void asociarAbonado(Abonado a) {
        this.informante = a;
    }

    public void asignarVisita(VisitaTecnica v) {
        this.visita = v;
        System.out.println("Visita técnica agendada para la solicitud: " + this.codinf);
    }

    //GETTERS QUE NECESITO
    public Modem getModemRoto() {
        return this.modemRoto;
    }

    public VisitaTecnica getVisita() {
        return this.visita;
    }

    public String getCodinf() {
        return this.codinf;
    }

    public String getProblema() {
        return this.problema;
    }

    public int getPrioridad() {
        return this.prioridad;
    }
}
