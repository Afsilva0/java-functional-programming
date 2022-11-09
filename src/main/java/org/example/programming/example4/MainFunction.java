package org.example.programming.example4;

import java.util.function.Function;

public class MainFunction {

    public static void main(String[] args) {

        /* Function es una interfaz generica
        *  Tiene como objetivo de recibir un parametro y devolver otro del tipo asignado
        *  Haciendo uso de su metodo apply
        */

        Function<Integer, String> convertidor = x -> Integer.toString(x);

        int numero = 3;

        System.out.println(convertidor.apply(numero));
        System.out.println(convertidor.apply(numero) instanceof String);
    }
}
