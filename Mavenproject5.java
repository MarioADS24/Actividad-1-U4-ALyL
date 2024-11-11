/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject5;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Mavenproject5 {

    public static void main(String[] args) {
        double precio, desc10, desc20, desc25, precioT;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese precio");
        precio = teclado.nextInt();
        if (precio <=100) {
            System.out.println("No aplica descuento");
        }
        if (precio > 100 && precio <= 200 ) {
            desc10 = precio * 0.1;
            precioT = precio - desc10;
            System.out.println("El precio con 10% de descuento es");
            System.out.println(precioT);
        }
         if (precio > 200 && precio <= 500 ) {
            desc20 = precio * 0.2;
            precioT = precio - desc20;
            System.out.println("El precio con 20% de descuento es");
            System.out.println(precioT);
        }
          if (precio > 500) {
            desc25 = precio * 0.25;
            precioT = precio - desc25;
            System.out.println("El precio con 25% de descuento es");
            System.out.println(precioT);
        }
    }      
}
