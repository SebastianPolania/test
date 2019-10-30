package org.jspapps.algoritmos.evaluador;

public class Pila {

    private int n, tope;
    private Object pila[];

    public Pila(int n){
        this.n = n;
        this.tope = 0;
        this.pila = new Object[n];
    }

    public boolean isEmpty(){
        return tope == 0;
    }

    public boolean isFull(){
        return tope == n;
    }

    public boolean apilar(Object data){
        if (isFull()){
            return false;
        }

        pila[tope] = data;
        tope++;
        return true;
    }

    public Object desapilar(){
        if (isEmpty()){
            return null;
        }

        tope--;
        return pila[tope];
    }

    public Object getTope(){
        return pila[tope-1];
    }

}
