package org.jspapps.algoritmos.arbol;

public class MainArbol {

    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        for (int i = 1; i <= 10; i++) {
            System.out.println("Numero "+(i));
            arbol.agregar(i);
        }
        System.out.println("Cantidad de nodos del árbol:" + arbol.cantidad());
    }
}
