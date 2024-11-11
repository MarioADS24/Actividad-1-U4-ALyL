/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject8;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Mavenproject8 {

    public static void main(String[] args) {
    int opcion;
    double pesosMX, cantidadI;
    Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese cantidad en pesos mexicanos");
        pesosMX = teclado.nextInt();
        System.out.println("Menú de conversor de monedas");
        System.out.println("1. Dólar (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Bath (THB)");
        System.out.println("4. Yen (JPY)");
        System.out.println("5. Won (KRW)");
        System.out.println("6. Dólar Australiano (AUD)");
        System.out.println("7. Sol (PEN)");
        System.out.println("8. Dólar Canadiense (CAD)");
        System.out.println("9. Bolivar (VES)");
        System.out.println("10. Peso Argentino (ARS)");
        System.out.println("Escriba la moneda que desee convertir");
        opcion = teclado.nextInt();
        
        
        switch (opcion) {
            case 1:
                cantidadI = pesosMX * 0.05;
                System.out.println("La conversion es de");
                System.out.println(cantidadI);
            break;
            
            case 2:
                cantidadI = pesosMX * 0.046;
                System.out.println("La conversion es de");
                System.out.println(cantidadI);
            break;
            
            case 3:
                cantidadI = pesosMX * 1.7;
                System.out.println("La conversion es de");
                System.out.println(cantidadI);
            break;
            
            case 4:
                cantidadI = pesosMX * 7.56;
                System.out.println("La conversion es de");
                System.out.println(cantidadI);
            break;
            
            case 5:
                cantidadI = pesosMX * 69.31;
                System.out.println("La conversion es de");
                System.out.println(cantidadI);
            break;
            
            case 6:
                cantidadI = pesosMX * 0.075;
                System.out.println("La conversion es de");
                System.out.println(cantidadI);
            break;
            
            case 7:
                cantidadI = pesosMX * 0.19;
                System.out.println("La conversion es de");
                System.out.println(cantidadI);
            break;
            
            case 8:
                cantidadI = pesosMX * 0.069;
                System.out.println("La conversion es de");
                System.out.println(cantidadI);
            break;
            
            case 9:
                cantidadI = pesosMX * 2.21;
                System.out.println("La conversion es de");
                System.out.println(cantidadI);
            break;
            
            case 10:
                cantidadI = pesosMX * 50.02;
                System.out.println("La conversion es de");
                System.out.println(cantidadI);
            break;
            
            
        }
        
    }
}
