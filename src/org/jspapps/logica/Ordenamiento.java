package org.jspapps.logica;

import java.util.Arrays;

public class Ordenamiento {

    public static void main(String[] args) {

        int[] array = {5,14,-3,10,4};
        System.out.print("Lista desordenada: ");
        imprimirLista(array);
        ordenar(array);

        System.out.print("Lista ordenada: ");
        imprimirLista(array);
    }

    private static int[] ordenar(int[] arreglo){
        for (int i = 0; i < arreglo.length - 1; i++){
            int min = i;
            for (int j = i + 1; j < arreglo.length; j++){
                if (arreglo[j] > arreglo[min]){
                    min = j;
                }
            }
            if (i != min){
                int tmp= arreglo[i];
                arreglo[i] = arreglo[min];
                arreglo[min] = tmp;
            }
        }
        return arreglo;
    }

    private static void imprimirLista(int[] arreglo){
        System.out.println(Arrays.toString(arreglo));
    }
}
