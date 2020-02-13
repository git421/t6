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
public class Yate extends AMotor{
    private int camarotes;
    
    public Yate(String matricula, Double eslora, int anoFabricacion, double cv, int camarotes) {
        super(matricula, eslora, anoFabricacion, cv);
        this.camarotes=camarotes;
    }
    
}
