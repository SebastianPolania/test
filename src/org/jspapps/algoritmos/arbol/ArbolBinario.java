package org.jspapps.algoritmos.arbol;

public class ArbolBinario {

    private Nodo raiz;
    private int cantidad;

    public ArbolBinario(){
        this.raiz = null;
        this.cantidad = 0;
    }

    public void agregar(int dato) {
        Nodo nuevo = new Nodo(dato);
        insertar(nuevo, raiz);
    }

    public void insertar(Nodo nuevo, Nodo pivote) {
        if (this.raiz == null) {
            raiz = new Nodo(5);
        } else {
            if (nuevo.getData() <= pivote.getData()) {
                if (pivote.getRefIzq() == null) {
                    pivote.setRefIzq(nuevo);
                } else {
                    insertar(nuevo, pivote.getRefIzq());
                }
            } else {
                if (pivote.getRefDer() == null) {
                    pivote.setRefDer(nuevo);
                } else {
                    insertar(nuevo, pivote.getRefDer());
                }
            }
        }
    }

    public int cantidad() {
        cantidad = 0;
        cantidad(raiz);
        return cantidad;
    }

    private void cantidad(Nodo reco) {
        if (reco != null) {
            cantidad++;
            cantidad(reco.getRefIzq());
            cantidad(reco.getRefDer());
        }
    }
}
