package org.jspapps.algoritmos.evaluador;

public class EvaluadorExpresion {

    public static double evaluar(String expInfija){
        String expPosfija = convertir(expInfija);
        System.out.println("La expresión posfija es: "+expPosfija);
        return evaluarPosfija(expPosfija);
    }

    private static String convertir(String infija){
        StringBuilder posfija = new StringBuilder();
        Pila pila = new Pila(50);
        for (int i = 0; i < infija.length(); i++) {
            var character = infija.charAt(i);
            if (esOperador(character)){
                if (pila.isEmpty()){
                    pila.apilar(character);
                } else {
                    if (prioridadOperador(character) > prioridadPila((char) pila.getTope())){
                        pila.apilar(character);
                    } else {
                        posfija.append(pila.desapilar());
                        pila.apilar(character);
                    }
                }
            } else {
                posfija.append(character);
            }
        }

        while (!pila.isEmpty()){
            posfija.append(pila.desapilar());
        }

        return posfija.toString();
    }

    private static boolean esOperador(char character) {
        return character == '^' || character == '*' || character == '+' || character == '-' || character == '/'
                || character == '(' || character == ')';
    }

    public static double evaluarPosfija(String expPosfija) {
        Pila pila = new Pila(100);
        for (int i = 0; i < expPosfija.length(); i++) {
            var character = expPosfija.charAt(i);
            if (!esOperador(character)){
                double num = Double.parseDouble(""+character);
                pila.apilar(num);
            } else {
                double n2 = (double) pila.desapilar();
                double n1 = (double) pila.desapilar();
                double calculo = hacerOperacion(character, n2, n1);
                pila.apilar(calculo);
            }
        }
        return (double) pila.getTope();
    }

    private static int prioridadOperador(char operador){
        if (operador == '^') return 4;
        if (operador == '*' || operador == '/') return 2;
        if (operador == '+' || operador == '-') return 1;
        if (operador == '(') return 5;
        return 0;
    }

    private static int prioridadPila(char operador){
        if (operador == '^') return 3;
        if (operador == '*' || operador == '/') return 2;
        if (operador == '+' || operador == '-') return 1;
        if (operador == '(') return 0;
        return 0;
    }

    private static double hacerOperacion(char character, double n2 ,double n1){
        switch (character){
            case '*': return n1 * n2;
            case '+': return n1 + n2;
            case '-': return n1 - n2;
            case '/': return n1 / n2;
            case '^': return Math.pow(n1, n2);
            default: return 0;
        }
    }
}
