package com.mycompany.bienvenidaconsalida;
import java.util.Scanner;

public class BienvenidaConSalida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String respuesta = "";
        
        while (!respuesta.equals("n")) {
            System.out.println("Bienvenido al programa.");
            System.out.print("Para salir, ingrese 'n': ");
            respuesta = scanner.nextLine().toLowerCase();
        }
        
        scanner.close();
    }
}