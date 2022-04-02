package com.mycompany.practica_semana2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Ejercicio5_semana2 {
    public static void main(String[] args) {
        double S_Bruto;
        double Des_T;
        double Renta = 0.10;
        double salario_M;
        double salario1;
        double F;
        double Min_T;
        double Total;
        Scanner leer = new Scanner(System.in);
        NumberFormat formato = new DecimalFormat("#0.00");
        
        System.out.println("Introduzca su nombre");
        String Nombre = leer.nextLine();
        
        System.out.println("Introduzca su Salario mensual");
        double Salario = leer.nextDouble();
        
        System.out.println("Introduzca los minutos tardes en el Mes");
        double Minuto = leer.nextDouble();
        
        Min_T = Salario / 30;
        salario1 = Min_T / 8;
        salario_M = salario1 / 60;
        F = salario_M * Minuto;
        
        //Formula
        
        S_Bruto = Salario - F;
        Des_T = S_Bruto * Renta;
        Total = S_Bruto - Des_T;
        
        System.out.println("Su nombre es: " + Nombre);
        
        System.out.println("Su descuento por llegaR es de: " + formato.format(F));
        
        System.out.println("La Retencion de Renta es: $" + formato.format(Des_T));
        
        System.out.println("Su Salario Total es de: $" + formato.format(Total) );
                
}
    }
