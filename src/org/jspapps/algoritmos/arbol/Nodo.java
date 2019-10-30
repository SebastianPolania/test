package org.jspapps.algoritmos.arbol;

public class Nodo {

    private int data;
    private Nodo refIzq, refDer;

    public Nodo(int data) {
        this.data = data;
        this.refIzq = null;
        this.refDer = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Nodo getRefIzq() {
        return refIzq;
    }

    public void setRefIzq(Nodo refIzq) {
        this.refIzq = refIzq;
    }

    public Nodo getRefDer() {
        return refDer;
    }

    public void setRefDer(Nodo refDer) {
        this.refDer = refDer;
    }
}
