package com.mycompany.sumaserie;
public class SumaSerie {
    public static void main(String[] args) {
        int numero = 1;
        int suma = 0;
        
        while (numero <= 20) {
            suma += numero;
            numero++;
        }
        
        System.out.println("La suma de la serie de números del 1 al 20 es: " + suma);
    }
}