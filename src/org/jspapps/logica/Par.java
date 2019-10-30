package org.jspapps.logica;

import java.util.Scanner;

public class Par {

    public static void main(String[] args) {

        System.out.println("--- Indicar si es número par ---");
        var scan = new Scanner(System.in);
        System.out.print("Ingrese un número:");
        var n = scan.nextInt();
        if (n>0){
            if (isPar(n)){
                System.out.println("El número ingresado es par.");
            } else {
                System.out.println("El número ingresado es impar.");
            }

        } else {
            System.out.println("El número ingresado debe ser entero positivo.");
        }

    }

    private static boolean isPar(int number){
        return number % 2 == 0;
    }
}
