package org.example.programming.example10;

import java.util.List;
import java.util.stream.Stream;

public class MainStreamFunction {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(4, 2, 3, 1, 34, 5, 6);


        /* Usos de Stream intermedios y terminales*/
        Integer respuesta = numbers.stream()
                .filter(number -> number % 2 == 0) // intermedio
                .map(number -> number * 2) // intermedio
                .reduce(0, Integer::sum); // terminal

        System.out.println(respuesta);


        Stream<Integer> respuestas = numbers.stream()
                .filter(number -> number % 2 == 0) // intermedio
                .map(number -> number * 2); // intermedio

        System.out.println(respuestas instanceof Stream<Integer>);
    }
}
