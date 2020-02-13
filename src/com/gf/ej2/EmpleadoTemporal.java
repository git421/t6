/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.ej2;

import java.util.Date;

/**
 *
 * @author cissanal
 */
public class EmpleadoTemporal extends Empleado{
    private Date fechaAlta;
    private Date fechaBaja;
    public static double salarioMes;

    public EmpleadoTemporal(String _nif, String _nombre, int _edad, Date fechaAlta, Date fechaBaja) {
        super(_nif, _nombre, _edad);
        this.fechaAlta=fechaAlta;
        this.fechaBaja=fechaBaja;
    }

    @Override
    public double calcularSalarioMensual() {
        return salarioMes;
    }
}
