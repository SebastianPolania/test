package org.jspapps.algoritmos;

import java.util.Scanner;

public class Multiplo {

    public static void main(String[] args) {

        var scan = new Scanner(System.in);
        System.out.println("--- Hallar múltiplos de 4 hasta un determinado número ---");
        System.out.print("Ingrese un número:");
        var n = scan.nextInt();
        System.out.print("Los múltiplos de 4 hasta el "+n+" son:");
        for (int i = 0; i <= n; i++) {
            System.out.print(" "+isMultiplo(4, i));
        }

    }

    private static int isMultiplo(int number1, int number2){
        return number1*number2;
    }
}
