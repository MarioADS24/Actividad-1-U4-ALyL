/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Mavenproject3 {

    public static void main(String[] args) {
        double califPar, califProy, califExam, califFin;
    Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese calificacion parcial");
        califPar = teclado.nextInt();
    System.out.println("Ingrese calificacion de proyecto");
        califProy = teclado.nextInt();
    System.out.println("Ingrese calificacion de examen");
        califExam = teclado.nextInt();
        
        califPar = califPar * 0.4;
        califProy = califProy * 0.3;
        califExam = califExam*0.3;
        califFin = califPar + califProy + califExam;
        System.out.println("Su calificacion final es: ");
        System.out.println(califFin);
    }
}
