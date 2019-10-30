package org.jspapps.algoritmos.evaluador;

import java.util.Scanner;

public class MainEvaluador {

    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.print("Ingrese la expresión que desea evaluar:");
        EvaluadorExpresion evaluadorExpresion = new EvaluadorExpresion();
        System.out.println("El resultado es: "+evaluadorExpresion.evaluar(scan.next()));
        //System.out.println("El resultado es: "+evaluadorExpresion.evaluarPosfija(scan.next()));
    }
}
