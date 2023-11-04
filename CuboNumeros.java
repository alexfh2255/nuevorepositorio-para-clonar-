package com.mycompany.cubonumeros;
import java.util.Scanner;

public class CuboNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        
        System.out.print("Ingrese la cantidad de números naturales: ");
        n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            int numero = scanner.nextInt();
            int cubo = numero * numero * numero;
            System.out.println("El cubo de " + numero + " es " + cubo);
        }
        
        scanner.close();
    }
}
