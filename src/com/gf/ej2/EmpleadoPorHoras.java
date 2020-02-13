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
public class EmpleadoPorHoras extends Empleado{
    private double horas;
    public static double precioHora=10;

    public EmpleadoPorHoras(String _nif, String _nombre, int _edad, double horas) {
        super(_nif, _nombre, _edad);
        this.horas=horas;
    }

    @Override
    public double calcularSalarioMensual() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
