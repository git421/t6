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
public class App {

    public static void main(String[] args) {
        Barco b1 = new Barco("ASDH201DAF", 30.0, 1936);
        LocalDate ahora = LocalDate.now();
        LocalDate despues = ahora.plusDays(30);
        Alquiler a1 = new Alquiler("Pepega", "12345A", ahora, despues, 0, b1);
        System.out.println(a1.calculaPrecio() + "€");
        b1.setCV(500);
        b1.setCamarotes(4);
        b1.setYate(true);
        System.out.println(a1.calculaPrecio() + "€");

    }
}
