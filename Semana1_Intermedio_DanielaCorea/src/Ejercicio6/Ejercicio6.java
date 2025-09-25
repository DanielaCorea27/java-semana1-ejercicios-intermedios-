/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author danie Ejercicio 6 – Estadísticas de Calificaciones Desarrolla un
 * programa que pida las notas de N estudiantes (donde N lo ingresa el usuario)
 * y calcule: - Promedio general. - Nota más alta. - Nota más baja.
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println("    Programa Calcular Notas    ");
        System.out.println("=============================");
        System.out.print("Ingrese la cantidad de estudiantes: ");
        int cantEstudiantes = entrada.nextInt();
        double promedio = 0; //variable que sumara todas las notas
        int[] notas = new int[cantEstudiantes]; //arreglo para guardar las notas, longitud la cantidad que el usuario ingrese

        for (int i = 0; i < cantEstudiantes; i++) {
            System.out.printf("Ingrese la nota de estudiante %d", i+1);
            System.out.print(" : ");
            int nota = entrada.nextInt();
            notas[i] = nota; // segun i posicion se guardaran las notas
            promedio += nota; // se va acumulando
        }
        promedio /= cantEstudiantes;
        System.out.println("=============================");
        System.out.printf("\nPromedio Final: %.2f%n", promedio);
        System.out.println("Nota más alta: "+ Arrays.stream(notas).max().getAsInt()); //Metodos de java.util.Arrays para el metodo de Maximo
        System.out.println("Nota más baja: "+ Arrays.stream(notas).min().getAsInt());//Metodos de java.util.Arrays para el metodo de Minimo
        System.out.println("=============================");
    }

}
