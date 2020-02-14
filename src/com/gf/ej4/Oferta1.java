/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.ej4;

/**
 *
 * @author cissanal
 */
public class Oferta1 implements Usuario{
    
  

    @Override
    public void conexion(int s) {
        if(s>30){
            int n=s-30;
            double d= s/n;
        }
    }

    @Override
    public double importe() {
        
    }

    @Override
    public void reset() {
        Usuario.super.conexion(0);
        
    }
    
    
}
