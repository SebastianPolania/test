package org.jspapps.logica;

import java.util.Scanner;
import java.util.Stack;

public class Palindromo {

    public static void main(String[] args) {

        var scan = new Scanner(System.in);
        System.out.print("Ingrese una palabra:");
        var word = scan.next();
        if (isPalindromo(word)){
            System.out.print("La palabra "+word+" no es Palindromo");
        } else {
            System.out.print("La palabra "+word+" es Palindromo");
        }

    }

    private static boolean isPalindromo(String word){
        var left=0;
        var right=word.length()-1;
        var flagError = false;
        while ((!flagError) && (left<right)){
            if (word.charAt(left)==word.charAt(right)){
                left++;
                right--;
            } else {
                flagError = true;
            }
        }

        return flagError;
    }
}
