package org.example.programming.example10;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainStream {

    public static void main(String[] args) {
        /* Se puede crear un Strin mediante su metodo of
         * o su construcición Builder
         */
        Stream<String> letras = Stream.of("a", "b", "c");

        String[] arreglo = {"a", "b", "c"};

        // Usando Clase Arrays
        Arrays.stream(arreglo);
        // Usando Stream of
        Stream<String> letras2 = Stream.of(arreglo);

        Stream<String> letras3 = Stream.<String>builder().add("a").add("b").add("c").build();

        // Usando Set
        Set<String> letras4 = new HashSet<>();
        letras4.add("a");
        letras4.add("b");
        letras4.add("c");

        Stream<String> streamSet = letras4.stream();

        // Usando HashMap
        HashMap<Integer, String> letras5 = new HashMap<>();
        letras5.put(1, "a");
        letras5.put(2, "b");
        letras5.put(3, "c");

        Stream<Integer> streamHashKey = letras5.keySet().stream();
        Stream<String> streamHashValues = letras5.values().stream();

        // Usando String chars
        String saludo= "Hola Mundo";
        IntStream streamChars= saludo.chars();
        streamChars.filter(n-> !Character.isDigit(n) && !Character.isSpaceChar(n)).
       forEach(n-> System.out.println((char) n));

        // Usando IntStream
        IntStream delunoalveinte = IntStream.range(1, 21);
        IntStream delunoalveinte2 = IntStream.rangeClosed(1, 20);

        /* Con el uso del metodo iterate se genera un Stream infinito
         * Este contendra el resultado de la expresión lambda
         *  Se puede limitar el numero con el metodo limit
         */
        Stream<Integer> streamIterate = Stream.iterate(1, n -> n + 1).limit(5);
        streamIterate.forEach(System.out::println);

        /* Con el uso del metodo generate se genera un Stream infinito
         * Este contendra el resultado de la expresión lambda
         * Se puede limitar el numero con el metodo limit
         */
        Stream<Double> streamGenerate = Stream.generate(Math::random).limit(2);
        streamGenerate.forEach(System.out::println);

        // Usando Random().ints()
        IntStream streamRamdom = new Random().ints().limit(5);
        streamRamdom.forEach(System.out::println);
    }
}
