package org.example.programming.example1;

import java.util.List;

public class Functional {
    public void printAllNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .forEach(Functional::print);
    }

    public void printAllNumbersInListFunctionalWithLambda(List<Integer> numbers) {
        numbers.stream()
                .forEach(number -> System.out.println(number));
    }

    public void printEventNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(Functional::isEvent)
                .forEach(Functional::print);
    }

    public void printEventNumbersInListFunctionalWithLambdas(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(number -> System.out.println(number));
    }


    public void printEventNumbersOfCubesInListFunctionalWithLambdas(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .forEach(number -> System.out.println(number));
    }

    public static void print(int number) {
        System.out.println(number);
    }

    public static Boolean isEvent(int number) {
        return number % 2 == 0;
    }
}
