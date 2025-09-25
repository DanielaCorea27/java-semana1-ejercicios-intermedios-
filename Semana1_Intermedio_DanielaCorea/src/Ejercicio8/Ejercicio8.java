/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author danie
 */
class Producto {//Creamos una clase para poder guardar objetos, que seran los productos como se almacena un producto con estas tres variables

    String nombre;
    double precio;
    int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
}

public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<Producto> productos = new ArrayList<>(); // El ArrayList lleva la clase Producto omo tipo en la lista productos
        int opcion = 0;
        do {
            System.out.println("=============================");
            System.out.println("    Sistema de Inventario   ");
            System.out.println("=============================");
            System.out.println("1. Registrar producto");
            System.out.println("2. Mostrar productos registrados.");
            System.out.println("3. Calcular el valor total del inventario");
            System.out.println("4. Salir");
            System.out.println("=============================");
            System.out.print("Selecciona una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("    REGISTRAR PRODUCTO  ");
                    System.out.println("-----------------------------");
                    System.out.print("Nombre: ");
                    String nombre = entrada.next();
                    System.out.print("Precio: $");
                    Double precio = entrada.nextDouble();
                    System.out.print("Cantidad: ");
                    int cantidad = entrada.nextInt();

                    productos.add(new Producto(nombre, precio, cantidad));//con add insertamos las variables en lista productos con la clase Producto
                    break;
                case 2:
                    System.out.println("-----------------------------");
                    System.out.println("    MOSTRAR PRODUCTOS");
                    System.out.println("-----------------------------");
                    for (Producto p : productos) { //p va navegando como tipo Producto navega en la lista productos
                        System.out.println("Producto: " + p.nombre + " - Precio: $" + p.precio + " - Cantidad: " + p.cantidad);
                    }
                    break;
                case 3:
                    System.out.println("-----------------------------");
                    System.out.println("    CALCULAR TOTAL INVENTARIO");
                    System.out.println("-----------------------------");
                    double total = 0;
                    for (Producto p : productos) {
                        total += p.precio * p.cantidad; //Durante el recorrido de p la variable total va sumando las multiplicaciones de precio*cantidad
                    }
                    System.out.println("Total Inventario: $"+ total);
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
