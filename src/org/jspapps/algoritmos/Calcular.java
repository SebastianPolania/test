package org.jspapps.algoritmos;

import java.util.Scanner;

public class Calcular {

    private static Double E = 0.0001;

    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("--- Calcular ---");
        System.out.print("Ingrese un número:");
        var n = scan.nextInt();
        calcularSuma(2, n);

    }

    private static void calcularSuma(int x, int n){
        double suma = 1 + x;
        for (int i = 2; i <= n; i++) {
            var temp = Math.pow(x, i)/getFactorial(i);
            if (temp > E){
                suma += temp;
                System.out.println(temp);
            } else {
                return;
            }
        }
        System.out.println("La sumatoria es "+suma);
    }

    private static int getFactorial(int number){
        var mFactorial = 1;
        while (number!=0){
            mFactorial *= number;
            number--;
        }
        return mFactorial;
    }
}
