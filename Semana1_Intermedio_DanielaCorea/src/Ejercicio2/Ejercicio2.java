/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;
import java.util.Scanner;
/**
 *
 * @author danie
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcion;
        System.out.println("=============================");
        System.out.println("    Calculadora Avanzada   ");
        System.out.println("=============================");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Potencia");
        System.out.println("6. Raíz Cuadrada");
        System.out.println("=============================");
        System.out.print("Selecciona una opción: ");
        opcion = entrada.nextInt();

        System.out.print("Ingrese Primer Numero: ");
        double num1 = entrada.nextDouble();

        System.out.print("Ingrese Segundo Numero: ");
        double num2 = entrada.nextDouble();

        switch (opcion) {
            case 1: // Suma
                double suma = num1 + num2;
                System.out.printf("\nLa suma: %.2f + %.2f = %.2f%n", num1, num2, suma);
                break;
            case 2: // Resta
                double resta = num1 - num2;
                System.out.printf("\nLa resta: %.2f - %.2f =4 %.2f%n", num1, num2, resta);
                break;
            case 3: // Multiplicación
                double multi = num1 * num2;
                System.out.printf("\nLa multiplicación: %.2f x %.2f = %.2f%n", num1, num2, multi);
                break;
            case 4: // División
                if (num2 != 0) {//Se verifica que el segundo numero no sea cero para que no truene
                    double divi = num1 / num2;
                    System.out.printf("\nLa división: %.2f / %.2f = %.2f%n", num1, num2, divi);
                } else {
                    System.out.println("\nNo se puede dividir entre cero");
                }
                break;
            case 5: // Potencia
                double potencia = Math.pow(num1, num2);
                System.out.printf("\nLa potencia: %.2f ^ %.2f = %.2f%n", num1, num2, potencia);
                break;
            case 6: // Raíz cuadrada (muestra ambas)
                if (num1 >= 0) { //Se verifica que los numeros sean mayores a cero para obtener la raiz cuadrada
                    double raiz1 = Math.sqrt(num1);
                    System.out.printf("\nLa raíz cuadrada de %.2f es %.2f%n", num1, raiz1);
                } else {
                    System.out.printf("\nNo se puede calcular la raíz cuadrada de %.2f (negativo)%n", num1);
                }
                if (num2 >= 0) {
                    double raiz2 = Math.sqrt(num2);
                    System.out.printf("La raíz cuadrada de %.2f es %.2f%n", num2, raiz2);
                } else {
                    System.out.printf("No se puede calcular la raíz cuadrada de %.2f (negativo)%n", num2);
                }
                break;
            default:
                System.out.println("\nOpción Inválida");
        }

        entrada.close();
    }
}

