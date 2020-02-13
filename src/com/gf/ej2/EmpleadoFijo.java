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
public class EmpleadoFijo extends Empleado{
    private int anoAlta;
    private double salarioBase;
    private double complemento;

    public EmpleadoFijo(String _nif, String _nombre, int _edad, int anoAlta, double salarioBase, double complemento) {
        super(_nif, _nombre, _edad);
        this.anoAlta=anoAlta;
        this.complemento=complemento;
        this.salarioBase=salarioBase;
    }
    
    
    
    public double calcularSalarioMensual(){
        return sueldo;
    }
}
