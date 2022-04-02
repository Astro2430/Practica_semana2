package com.mycompany.practica_semana2;

import java.util.Scanner;

public class Ejercicio3_semana2 {
    public static void main(String[] args) {
        double S_Base = 800.00;
        double Salario = 0.0;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la Cantidad de Autos Vendidos");
        double N = leer.nextDouble();
        
        System.out.println("Ingrese el Nombre del Vendedor");
        double Nombre = leer.nextDouble();
        
        //System.out.println("Cuantas Ventas Realizo en el Mes:");
        //int xventas = leer.nextInt(;
        double com = ComisionAutosDos();
        
        //ComisionAutosDos(N);
        Salario = S_Base + ComisionAutosVendidos(N) + com;
        
        System.out.println("El Salario del Empleado es: $" + Salario);
        System.out.println("El Nombre del Empleado es: $" + Nombre);
    }
    
    public static double ComisionAutosVendidos(double Cantidad) {
        //double Comision =170;
        double T_Comision =170 * Cantidad;
        return T_Comision;
    }
        public static double ComisionAutosDos(){
        int xventas = 3;
        double Valor_V1 = 5000;
        double Valor_V2 = 7000;
        double Valor_V3 = 15000;
        
        double Comision = (Valor_V1 * 0.05) + (Valor_V2 * 0.05) + (Valor_V3 * 0.05);
        return Comision;
    }
}
