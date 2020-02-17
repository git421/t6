/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.ej5;

/**
 *
 * @author cissanal
 */
public class Alfareria implements ProductoFragil{

    private double precio;
    private String descripcion;
    private String claseEmbalaje;
    private double peso;

    public Alfareria(double precio, String descripcion, double peso) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    
    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getClaseEmbalaje() {
        return claseEmbalaje;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setClaseEmbalaje(String claseEmbalaje) {
        this.claseEmbalaje = claseEmbalaje;
    }
    
    public void asignarEmbalaje(String embalaje){
        this.claseEmbalaje= embalaje;
    }
    
    
    
    @Override
    public String dameEmbalaje() {
        return this.claseEmbalaje;
    }

    @Override
    public double damePeso() {
        return this.peso;
    }

    @Override
    public double damePrecio() {
        return this.precio;
    }

    @Override
    public String dameDescripcion() {
        return this.descripcion;
    }

    @Override
    public String toString() {
        return "Alfareria{"  + ", claseEmbalaje=" + claseEmbalaje + ", peso=" + peso + '}';
    }
    
    
}
