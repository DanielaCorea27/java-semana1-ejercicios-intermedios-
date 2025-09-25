/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

import java.util.Scanner;
import java.util.Random;//importamos

/**
 *
 * @author danie
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random(); //rand lleva la clase random

        int numAleatorio = rand.nextInt(100) + 1; //generamos el numero random a partir de rand en 100
        boolean adivino = false; // ahorita adivino es false nuestra variable que nos ayudara a salir de bucle
        int contador = 0; //inicia en cero

        while (adivino == false) { //mientras sea false se repetira el bucle
            System.out.println("=============================");
            System.out.println("    Adivinar Numero    ");
            System.out.println("=============================");
            System.out.print("Adivina el número: ");
            int num = entrada.nextInt();
            contador++;
            if (num == numAleatorio) {
                System.out.println("-----------------------------");
                System.out.println("¡Felicidades! Lo lograste en "+contador +" intentos");
                System.out.println("-----------------------------");
                adivino = true;//como ya adivino adivino vale true y sale del bucle
            } else if(num < numAleatorio){ //mientars tanto se repetira
                System.out.println("-----------------------------");
                System.out.println("Demasiado bajo");
                System.out.println("-----------------------------");
            }else{
                System.out.println("-----------------------------");
                System.out.println("Demasiado alto");
                System.out.println("-----------------------------");
            }
        }
    }

}
