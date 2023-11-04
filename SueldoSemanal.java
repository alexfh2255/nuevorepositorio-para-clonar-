package com.mycompany.sueldosemanal;
import java.util.Scanner;

public class SueldoSemanal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int empleados = 20;
        
        while (empleados > 0) {
            System.out.print("Ingrese las horas trabajadas para el empleado #" + empleados + ": ");
            double horasTrabajadas = scanner.nextDouble();
            System.out.print("Ingrese el pago por hora para el empleado #" + empleados + ": ");
            double pagoPorHora = scanner.nextDouble();
            
            double sueldoSemanal = horasTrabajadas * pagoPorHora;
            System.out.println("El sueldo semanal del empleado #" + empleados + " es: " + sueldoSemanal);
            
            empleados--;
        }
        
        scanner.close();
    }
}