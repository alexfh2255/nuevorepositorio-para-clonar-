package com.mycompany.contadorpositivosnegativos;
import java.util.Scanner;

public class ContadorPositivosNegativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadpositivos = 0;
        int cantidadnegativos = 0;
        
        for (int i = 0; i < 100; i++) {
            System.out.print("Ingresa un número: ");
            int numero = scanner.nextInt();
            
            if (numero > 0) {
                cantidadpositivos++;
            } else if (numero < 0) {
                cantidadnegativos++;
            }
        }
        
        System.out.println("números positivos: " + cantidadpositivos);
        System.out.println("números negativos: " + cantidadnegativos);
    }
}
