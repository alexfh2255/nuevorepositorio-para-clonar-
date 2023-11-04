package com.mycompany.salarioconincremento;
public class SalarioConIncremento {
    public static void main(String[] args) {
        double salarioInicial = 1500;
        double salarioActual = salarioInicial;
        
        for (int i = 1; i <= 6; i++) {
            salarioActual += salarioActual * 0.10;
            System.out.println("Año " + i + ": Salario = $" + salarioActual);
        }
        
        System.out.println("Salario al cabo de 6 años: $" + salarioActual);
    }
}