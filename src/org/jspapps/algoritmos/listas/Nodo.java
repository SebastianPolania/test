package org.jspapps.algoritmos.listas;

public class Nodo {

    private Object data;
    private Nodo refIzq, refDer;

    public Nodo(Object data) {
        this.data = data;
        this.refIzq = null;
        this.refDer = null;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
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

    @Override
    public String toString() {
        return data.toString();
    }

}
