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
public interface Usuario {
    String dni="";
    String nombre="";
    void conexion(int s); //contabiliza 's' segundos en la cuenta
    double importe(); //calcula el importe facturable 
    void reset(); //pone a 0 la cuenta
}
