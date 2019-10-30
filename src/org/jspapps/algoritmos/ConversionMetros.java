package org.jspapps.algoritmos;

import java.util.Scanner;

public class ConversionMetros {

    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("--- De metros a pies y pulgadas ---");
        System.out.print("Ingrese cantidad de metros: ");
        var metros = scan.nextInt();
        printPies(metros);
        printPulgadas(metros);
    }

    private static void printPies(int metros){
        var pies = (metros*3.28084)/1;
        System.out.println(metros+" metros son "+pies+" pies.");
    }

    private static void printPulgadas(int metros){
        var pulgadas = (metros*39.37)/1;
        System.out.println(metros+" metros son "+pulgadas+" pulgadas.");
    }
}
