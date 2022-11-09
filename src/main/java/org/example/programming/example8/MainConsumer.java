package org.example.programming.example8;

import java.util.function.Consumer;

public class MainConsumer {


    public static void main(String[] args) {

        Consumer<String> consumer = (cadena) -> System.out.println(cadena);
        consumer.accept("Hola");
    }
}
