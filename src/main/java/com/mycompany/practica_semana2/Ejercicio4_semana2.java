package com.mycompany.practica_semana2;

import java.util.Scanner;

public class Ejercicio4_semana2 {
    public static void  main (String[] args){
        double Salario = 300.00;
        double Comision = 50.00;
        double renta = 0.10;
        double Salario_Co;
        double Salario_Re;
        double Salario_To;
        double Renta;
        double Comi_;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingreses el Nombre del Vendedor");
        String Nombre = leer.nextLine();
        
        System.out.println("Cuantas ventas realizo en el Mes");
        double Venta = leer.nextDouble();
        
        Comi_= Venta * Comision;
        
        Salario_Co = Salario + Comi_;
        Salario_Re = Salario *  renta;
        Salario_To = Salario_Co -Salario_Re;  
        
        System.out.println("El Salario Total es de:$" + Salario_To);
        
        Renta = Salario* renta;
        
        System.out.println("El monto a Pagar de renta es de:$" + Renta);
        
        
        
        
    }
    
}
