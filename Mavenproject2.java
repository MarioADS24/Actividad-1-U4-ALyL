/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Mavenproject2 {

    public static void main(String[] args) {
       
    double calificacion;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingresar calificacion");
    calificacion = teclado.nextInt();
    if (calificacion >=90 && calificacion <=100){
        System.out.println("Su calificacion es A");
    }
    if (calificacion >=80 && calificacion <=89){
        System.out.println("Su calificacion es B");
    }
    if (calificacion >=70 && calificacion <=79){
        System.out.println("Su calificacion es C");
    }
    if (calificacion >=90 && calificacion <=100){
        System.out.println("Su calificacion es A");
    }
    if (calificacion >=60 && calificacion <=69){
        System.out.println("Su calificacion es D");
    }
    if (calificacion <=60){
        System.out.println("Su calificacion es F");
    }
    }
}
