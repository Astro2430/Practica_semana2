package com.mycompany.practica_semana2;

import java.util.Scanner;

public class Ejercicio2_semana2 {
     public static void main(String[] args) {
         double DAI;
         double Depreciacion = 0.10;
         double TotalN1;
         double TotalN2;
         double TotalN3;
         double Mul_1 = 0.25;
         double Mul_2 = 0.10;
         double Total;
         Scanner leer = new Scanner(System.in);
         
         System.out.println("Introduzca el Valor del Vehiculo en USA");
         double V_Vehiculo = leer.nextDouble();
         
         System.out.println("Introduzca el valor de Flete ");
         double Flete = leer.nextDouble();
         
         System.out.println("Introduzca el Valor del  Seguro");
         double Seguro = leer.nextDouble();
         
         DAI = V_Vehiculo * Depreciacion;
         TotalN1 =  V_Vehiculo - DAI;
         TotalN2 = TotalN1 -  Flete;
         TotalN3 = TotalN2 - Seguro;
         Total = TotalN3 * Mul_1;
         
         System.out.println("El valor de la importacionde su Vehiculo es: $ " + Total);
         
         Depreciacion = V_Vehiculo * Mul_2;
         
         System.out.println("El valor de Depreciacion es de: $ " + Depreciacion);
                 
         
     }
}
