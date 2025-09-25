/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double saldo = 500.00;
        int opcion;

        do {
            System.out.println("=============================");
            System.out.println("    Cajero Automático   ");
            System.out.println("=============================");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar Saldo");
            System.out.println("3. Retirar Dinero");
            System.out.println("4. Salir");
            System.out.println("=============================");
            System.out.print("Selecciona una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.printf("\nSaldo Actual: %.2f%n", saldo);
                    break;

                case 2:
                    System.out.print("\nIngrese la cantidad a depositar: $");
                    double deposito = entrada.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito; //Se le suma el deposito al saldo
                        System.out.printf("\nDepósito exitoso \nNuevo Saldo: %.2f%n", saldo);
                    } else {
                        System.out.println("\nCantidad Inválida");
                    }
                    break;

                case 3:
                    System.out.print("\nIngrese la cantidad a retirar: $");
                    double retiro = entrada.nextDouble();
                    if (retiro <= saldo && retiro > 0) { //Para retirar el retiro debe ser menor o igual al saldo y mayor que cero
                        saldo -= retiro; //Se le resta al saldo el retiro
                        System.out.printf("\nRetiro exitoso \nNuevo Saldo: %.2f%n", saldo);
                    } else {
                        System.out.println("\nCantidad inválida o fondo insuficiente");
                    }
                    break;

                case 4:
                    System.out.println("\nGracias por preferirnos");
                    break;

                default:
                    System.out.println("\nOpción Inválida. Intenta de nuevo\n");
            }
        } while (opcion != 4);
    }
}
