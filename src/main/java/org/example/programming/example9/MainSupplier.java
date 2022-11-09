package org.example.programming.example9;

import java.util.function.Supplier;

public class MainSupplier {

    public static void main(String[] args) {
      Supplier<String> i= ()-> "Andres Silva";

      System.out.println("El valor pasado es " + i.get());
    }
}
