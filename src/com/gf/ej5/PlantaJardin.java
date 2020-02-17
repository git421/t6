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
public class PlantaJardin implements ProductoVivo{

    private double precio;
    private String descripcion;
    private boolean tieneRiego;
    private boolean alimentada;

    public PlantaJardin(double precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public void setAlimentada(boolean alimentada) {
        this.alimentada = alimentada;
    }

    public boolean isAlimentada() {
        return alimentada;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isTieneRiego() {
        return tieneRiego;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTieneRiego(boolean tieneRiego) {
        this.tieneRiego = tieneRiego;
    }
    
    
    
    
    public boolean tieneRiego() {
        return this.tieneRiego;
    }
    
    
    @Override
    public boolean necesitaComida() {
        return !this.tieneRiego;
    }

    @Override
    public boolean necesitaRiego() {
        return !this.alimentada;
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
        return "PlantaJardin{"  + ", tieneRiego=" + tieneRiego + '}';
    }
    
    
}
