/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.ej2;

/**
 *
 * @author cissanal
 */
abstract public class Empleado {

    protected String nif;
    protected String nombre;
    protected int edad;

    public Empleado(String _nif, String _nombre, int _edad) {
        this.nif = _nif;
        this.nombre = _nombre;
        this.edad = _edad;
    }

    public String getNif() {
        return nif;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    

    public String toString() {
        String s;
        s = "Nombre: " + this.nombre + "\n";
        s += "NIF: " + this.nif + "\n";
        s += "Edad: " + this.edad + " "+this.getClass().getSimpleName();
        return s;
    }
    
    abstract public double calcularSalarioMensual();
    
}
