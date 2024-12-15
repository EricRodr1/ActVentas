/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actsemana5;
import java.util.Scanner;
/**
 *
 * @author Eric Rodriguez
 */
public class Actsemana5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //Aplicacion 1 
        int numventas;
        System.out.println("Favor ingresar el numero de ventas del dia de hoy: ");
        numventas = sc.nextInt();
       double totaldeventas=0;
       
        for (int i = 1; i < numventas; i++) {
            System.out.println("Favor ingrese la cantidad de la venta" + i + ": ");
            double venta = sc.nextDouble();
            totaldeventas += venta;
            System.out.println("La suma de las ventas es: "+totaldeventas);
        }
        
        //Dia Laboral
        String diasemana;
        System.out.println("Favor ingresar dia de la semana: ");
        diasemana = sc.nextLine(); 
        switch (diasemana){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
            case "sabado":
                System.out.println( diasemana+ "es dia laboral");
                break;
            case "domingo":
                System.out.println( diasemana+ "no es dia laboral");
                break; 
            
        }
        
        //Primos
        System.out.println("Los numeros primos entre 1 y 100:");
        
        for (int i = 2; i <= 100; i++) {
            if (esnumprimo(i)) {
                System.out.print(i + " ");
            }
        }
    }

 
    public static boolean esnumprimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
 
            
        }
       
           
    }

