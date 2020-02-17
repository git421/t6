/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.ej5;

/**
 *
 * @author cissanal
 */
public class Vivero {
    
    public static void mostrarDatos(Producto p){
        System.out.println(p.dameDescripcion() + " "+ p.damePrecio());
        if(p instanceof PlantaJardin){
            System.out.println("Necesita riego? " +((PlantaJardin) p).necesitaRiego());
            System.out.println("Necesita comida? " +((PlantaJardin) p).necesitaComida());
        }else if(p instanceof Alfareria){
            System.out.println("Embalaje " +((Alfareria) p).dameEmbalaje());
            System.out.println("Peso " +((Alfareria) p).damePeso());
        }
    }
    
    public static void main(String[] args) {
        
        PlantaJardin Geranio = new PlantaJardin(25.5, "Mis geranios floridos");
        Alfareria Terracota = new Alfareria(120.75, "Tiesto", 20);
        System.out.println(Geranio.damePrecio());
        System.out.println(Geranio);
        System.out.println(Terracota);
        mostrarDatos(Terracota);
        
    }
}
