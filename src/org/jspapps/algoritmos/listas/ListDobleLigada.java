package org.jspapps.algoritmos.listas;

public class ListDobleLigada {

    private Nodo aptFirst, aptLast;
    private int totalNodos;

    ListDobleLigada() {
        this.aptFirst = null;
        this.aptLast = null;
        this.totalNodos = 0;
    }

    public boolean isEmpty(){
        return this.aptFirst==null;
    }

    public void addItem(Object data){
        Nodo nodo = new Nodo(data);
        this.totalNodos++;

        if (isEmpty()){
            this.aptFirst = nodo;
            this.aptLast = nodo;
            return;
        }

        this.aptLast.setRefDer(nodo);
        nodo.setRefIzq(this.aptLast);
        this.aptLast = nodo;
    }

    public void insertItem(Object data, int position){
        if (isEmpty() || position>totalNodos){
            addItem(data);
            return;
        }

        Nodo nodo = new Nodo(data);
        if (position==1){
            nodo.setRefDer(aptFirst);
            aptFirst.setRefIzq(nodo);
            aptFirst = nodo;
            return;
        }

        Nodo apuntador = aptFirst;
        int cont = 1;
        while (cont < position){
            apuntador = apuntador.getRefDer();
            cont++;
        }

        apuntador.getRefIzq().setRefDer(nodo);
        nodo.setRefIzq(apuntador.getRefIzq());
        apuntador.setRefIzq(nodo);
        nodo.setRefDer(apuntador);

    }

    @Override
    public String toString() {
        StringBuilder aux = new StringBuilder();
        Nodo i = aptFirst;
        while (i!=null){
            aux.append(i.toString()).append("\n");
            i = i.getRefDer();
        }
        return aux.toString();
    }
}
