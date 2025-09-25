/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author danie Ejercicio 5 – Factorial Crea un programa que calcule el
 * factorial de un número ingresado por el usuario. Fórmula: n! = n * (n-1) *
 * (n-2) * ... * 1
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println("    Calcular Factorial    ");
        System.out.println("=============================");
        System.out.print("Digite un Número Entero: ");
        int num = entrada.nextInt();

        int factorial = 1; //se inicializa la fatcorial con 1

        for (int i = num; i >= 1; i--) { //si ingresa 6 inicia el i desde 6 hasta que i sea mayor o igual a 1 y decrementa osea 6-5-4-3-...
            factorial *= i; // se le va multiplicando al factorial 1*6;6*5;30*4.......
        }
        System.out.println("La factorial de "+ num + " es: "+ factorial);
    }
}
