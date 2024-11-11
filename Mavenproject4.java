/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject4;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Mavenproject4 {

    public static void main(String[] args) {
        int edad;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        edad = teclado.nextInt();
        if (edad >=18) {
            System.out.println("Usted es apto para votar");
        }
    }
}
