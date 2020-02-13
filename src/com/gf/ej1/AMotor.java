/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.ej1;

/**
 *
 * @author cissanal
 */
public class AMotor extends Barco{
    protected double cv;
    
    public AMotor(String matricula, Double eslora, int anoFabricacion, double cv) {
        super(matricula, eslora, anoFabricacion);
        this.cv = cv;
    }
    
}
