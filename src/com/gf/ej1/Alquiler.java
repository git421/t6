/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.ej1;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author cissanal
 */
public class Alquiler {

    private Cliente cli;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Amarre amarre;
    private Barco barco;

    public Alquiler(String nombre, String DNI, LocalDate fechaInicio, LocalDate fechaFin, int posicion, Barco barco) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaInicio = fechaInicio;
        this.posicion = posicion;
        this.barco = barco;
        this.fechaFin = fechaFin;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public int getPosicion() {
        return posicion;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", DNI=" + DNI + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", posicion=" + posicion + ", barco=" + barco + '}';
    }

    public double calculaPrecio() {
        long dias = (ChronoUnit.DAYS.between(fechaInicio, fechaFin) + 1);
        double modulo = (this.barco.getEslora()) * 10;
        int valor = 2;

        if (this.barco.isVelero()) {
            return dias * (modulo + this.barco.getMastiles()) * valor;
        } else if (this.barco.isDeportivo()) {
            return dias * (modulo + this.barco.getCV()) * valor;
        } else if (this.barco.isYate()) {
            return dias * (modulo + this.barco.getCV() + this.barco.getCamarotes()) * valor;
        } else {
            return dias * modulo * valor;
        }

    }

}
