package org.jspapps.algoritmos.pila;

import java.util.Random;
import java.util.Stack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainTransaccion {

    public static void main(String[] args) {
        Stack pila = new Stack();

        AddItem addItem = new AddItem(pila);
        RemoveItem removeItem = new RemoveItem(pila);

        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(addItem);
        executor.execute(removeItem);

    }

    private static class AddItem implements Runnable{
        private Stack pila;

        public AddItem(Stack item){
            this.pila = item;
        }

        @Override
        public void run() {
            Random random = new Random();
            while (true){
                try{
                    int t = random.nextInt(4000);
                    Thread.sleep(t);
                    int number = random.nextInt(200);
                    System.out.println("Ingresa transaccion: "+pila.push(number)+" Size: "+pila.size()+" Tope: "+pila.peek());

                }catch (InterruptedException ex){
                    System.out.println(ex.getMessage());
                }
            }
        }
    }

    private static class RemoveItem implements Runnable{
        private Stack pila;

        public RemoveItem(Stack item){
            this.pila = item;
        }

        @Override
        public void run() {
            Random random = new Random();
            while (true){
                try{
                    int t = random.nextInt(2000);
                    Thread.sleep(4000);
                    System.out.println("Sale transaccion: "+pila.pop()+" Size: "+pila.size()+" Tope: "+pila.peek());

                }catch (InterruptedException ex){
                    System.out.println("Error -> "+ex.getMessage());
                    run();
                }
            }
        }
    }


}
