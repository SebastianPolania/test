package org.jspapps.algoritmos.arbol;

public class MainArbol {

    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        arbol.agregar(50);
        arbol.agregar(20);
        arbol.agregar(70);
        arbol.agregar(71);
        arbol.agregar(15);
        arbol.agregar(1);
        arbol.agregar(100);
        arbol.agregar(120);
        arbol.agregar(45);
        arbol.agregar(33);
        System.out.println("Cantidad de nodos del árbol:" + arbol.cantidad());
    }
}
