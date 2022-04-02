package com.mycompany.practica_semana2;

import java.util.Scanner;

public class Ejercicio1_semana2 {

    public static void main(String[] args) {
        double Rebaja = 0.15;
        double Total;
        double IVA = 0.13;
        double T_precio = 0.0;
        double F_precio;
        double I_precio;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduzca el precio de la computadora");
        double T = leer.nextDouble();
        
        T_precio = T * IVA;
        I_precio = T + T_precio;
        F_precio = I_precio * Rebaja;
        Total =  I_precio - F_precio;   
        
        System.out.println("El precio total es: $" + Total);
    }
}
