/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.ej1;

import java.time.LocalDate;

/**
 *
 * @author cissanal
 */
abstract public class Barco {
    
    protected String matricula;
    protected Double eslora; //metros
    protected int anoFabricacion;
    protected final int CTE = 2;
    

    public Barco(String matricula, Double eslora, int anoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anoFabricacion = anoFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public Double getEslora() {
        return eslora;
    }

    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setEslora(Double eslora) {
        this.eslora = eslora;
    }

    public void setAnoFabricacion(int anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", anoFabricacion=" + anoFabricacion + ", CTE=" + CTE + '}';
    }

    
    public double getModulo(){
        //en los otros return super.getModulo + su cosa
    }
    

    














    
    
}





