/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject7;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Mavenproject7 {

    public static void main(String[] args) {
    int opcion;
    double grados, F, K;
    Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese los grados en Celisios");
        grados = teclado.nextInt();
        System.out.println("Menú de opciones a convertir");
        System.out.println("1. Grados Fahrenheit");
        System.out.println("2. Grados Kalvin");
        System.out.println("Escriba la opción que requiera");
        opcion = teclado.nextInt();
        
    switch (opcion) {
        case 1:
            F = (grados * 1.8) + 32;
            System.out.println("El resultado de la conversion es");
            System.out.println(F);
            break;
        case 2:
            K = grados + 273.15;
            System.out.println("El resultado de la conversion es");
            System.out.println(K);
            break;
    }   
    }
}
