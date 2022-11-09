package org.example.programming.example6;

import java.util.function.Predicate;

public class MainPredicate {

    public static void main(String[] args) {

        /* Predicate es una interfaz generica
         * Tiene como objetivo recibir un parametro y devolver un booleano
         * Haciendo uso de su metodo test
         */

        Predicate<Integer> validarPar = (x) -> x % 2 == 0;

        boolean resultado = validarPar.test(4);
        System.out.println(resultado);

    }
}
