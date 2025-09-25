/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author danie Ejercicio 4 – Serie Fibonacci Haz un programa que muestre los n
 * primeros términos de la serie Fibonacci, donde n es ingresado por el usuario.
 * La serie empieza en: 0, 1, 1, 2, 3, 5, 8, 13…
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println("    Serie Fibonacci    ");
        System.out.println("=============================");
        System.out.print("Digite un Número Entero Para la Cantidad  De la Serie Fibonacci: ");
        int cantSerie = entrada.nextInt();
        int num1 = 0; //El primer numero de la seria
        int num2 = 1; //El segundo numero de la seria

        for (int i = 1; i <= cantSerie; i++) {
            System.out.print(num1 + " - "); //primero num1 vale 0, despues en la segunda vale 1 y asi......
            int num3 = num1 + num2;// aqui al inicio se esta suman 0 + 1
            num1 = num2;// Ahora num1 vale 1
            num2 = num3; // y num2 vale la suma anterior osea siempre 1
        }
    }
}
