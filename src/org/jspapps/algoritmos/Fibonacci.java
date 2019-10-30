package org.jspapps.algoritmos;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int trasAnterior = 0, anterior = 1, temp;
        System.out.print("Introduce número: ");
        int n = sc.nextInt();

        System.out.print(trasAnterior+" ");
        System.out.print(anterior+" ");
        while (trasAnterior+anterior <= n){
            temp = trasAnterior;
            trasAnterior = anterior;
            anterior = temp + trasAnterior;
            System.out.print(anterior+" ");
        }

    }
}
