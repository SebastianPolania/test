package org.jspapps.algoritmos.listas;

public class FilaBanco {

    public static void main(String[] args) {
        ListDobleLigada lista = new ListDobleLigada();

        Persona p1 = new Persona("Santiago Arias", 26);
        Persona p2 = new Persona("Falcao Garcia", 28);
        Persona p3 = new Persona("James Rodriguez", 26);

        lista.addItem(p1);
        lista.addItem(p2);
        lista.addItem(p3);

        System.out.println(lista);

        Persona p4 = new Persona("Juan Cuadrado", 29);
        Persona p5 = new Persona("Pepe Garcia", 28);
        Persona p6 = new Persona("Enuar Rodriguez", 26);

        lista.insertItem(p4, 10);
        lista.insertItem(p5, 1);
        lista.insertItem(p6, 3);

        System.out.println(lista);

    }
}
