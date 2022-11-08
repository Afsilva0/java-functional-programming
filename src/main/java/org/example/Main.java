package org.example;

import org.example.programming.Functional;
import org.example.programming.Structured;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 45, 63, 13, 2, 6, 7, 12);
        Structured structured = new Structured();
        Functional functional = new Functional();


        /* Example
         * Programming Print All number
         */

        // Programmin Structured
        // structured.printAllNumbersInListStructured(numbers);

        // Programmin Funcional
        //functional.printAllNumbersInListFunctional(numbers);

        // Programmin Funcional With Lambdas
        // functional.printAllNumbersInListFunctionalWithLambda(numbers);


        /* Example
         * Programming Print with Event number
         */

        // Programmin Structured
        //structured.printEventNumbersInStructured(numbers);


        // Programmin Funcional
        //functional.printEventNumbersInListFunctional(numbers);

        // Programmin Funcional With Lambdas
        //functional.printEventNumbersInListFunctionalWithLambdas(numbers);

        // Programmin Funcional With Lambdas And Map
        functional.printEventNumbersOfCubesInListFunctionalWithLambdas(numbers);

    }
}