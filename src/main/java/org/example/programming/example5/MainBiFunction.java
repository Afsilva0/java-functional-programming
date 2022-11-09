package org.example.programming.example5;

import java.util.function.BiFunction;

public class MainBiFunction {

    public static void main(String[] args) {

        /* BiFunction es una interfaz generica
         *  Tiene como objetivo de recibir dos parametros y devolver otro del tipo asignado
         *  Haciendo uso de su metodo apply
         */
        BiFunction<Integer, String, String> convertidor = (x, y) -> x.toString().concat(": ").concat(y);

        String respuesta = convertidor.apply(1, "Andres Silva");
        System.out.println(respuesta);
    }
}
