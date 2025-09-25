/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author danie 
 * Ejercicio 3 – Números Primos Crea un programa que pida al
 * usuario un número y determine si es número primo o no. Un número primo solo
 * tiene dos divisores: 1 y él mismo.
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println("    Numero Primo    ");
        System.out.println("=============================");
        System.out.print("Digite un Número Entero: ");
        int num = entrada.nextInt();

        boolean numeroPrimo = true;//lo inicializamos en true y si pasa algun filtro cambiara a false.

        if (num <= 1) { //Si ya el numero es menor o igual a 1 no es primo
            numeroPrimo = false; 
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) { // Este va a recorrer todos los posibles divisores desde 2 hasta la raíz cuadrada de 'num'
                if (num % i == 0) { // Si el residuo en esas diviones resulta cero tampoco es primo.
                    numeroPrimo = false; 
                    break; 
                }
            }
        }

        if (numeroPrimo) {
            System.out.println("El número " + num + " es primo.");
        } else {
            System.out.println("El número " + num + " no es primo.");
        }
    }
}