package org.example.programming.example10;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainStream {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(4, 2, 3, 1, 34, 5, 6);


        /* Se puede crear un Strin mediante su metodo of
         * o su construcición Builder
         */
        Stream<String> letras = Stream.of("a", "b", "c");

        String[] arreglo={"a","b","c"};
        Stream<String> letras2= Stream.of(arreglo);

        Stream<String> letras3= Stream.<String>builder()
                .add("a")
                .add("b")
                .add("c").build();

        IntStream delunoalveinte= IntStream.range(1,21);
        IntStream delunoalveinte2= IntStream.rangeClosed(1,20);


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
