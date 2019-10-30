package org.jspapps.logica;

import java.util.Arrays;
import java.util.Scanner;

public class Promedio {

    public static void main(String[] args) {

        var scan = new Scanner(System.in);
        System.out.println("--- Calcular promedio de una lista de números ---");
        System.out.print("Ingrese el tamaño de la lista:");
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un número:");
            array[i] = scan.nextInt();
        }
        System.out.println("El promedio para la lista "+ Arrays.toString(array) +" es "+promedio(array));

    }

    private static int promedio(int[] array){
        int promedio;
        int suma = 0;
        for (int value : array) {
            suma += value;
        }
        promedio = suma/array.length;
        return promedio;
    }
}
