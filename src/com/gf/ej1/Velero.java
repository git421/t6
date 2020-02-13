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
public class Velero extends Barco{
    private int numMastiles;

    public Velero(String matricula, Double eslora, int anoFabricacion, int numMastiles) {
        super(matricula, eslora, anoFabricacion);
        this.numMastiles=numMastiles;
    }
    
    
    
}
