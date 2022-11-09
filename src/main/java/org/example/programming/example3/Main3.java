package org.example.programming.example3;

public class Main3 {

    public static void main(String[] args) {


        /*
         * Para solucionar problema de ambiguedad
         * se puede indicar el tipo de dato
         */
        engine((int x, int y) -> x + y);


        /*
         * Para solucionar problema de ambiguedad
         * se puede castear al tipo de sobrecarga de metodo
         */
        engine((CalculadoraLong) (x, y) -> x + y);


        /*
         * Para solucionar problema de ambiguedad
         * se puede definir el tipo de respuesta
         */

        CalculadoraInt calculadoraInt = (x, y) -> x + y;
        engine(calculadoraInt);

    }

    public static void engine(CalculadoraInt calculadoraInt) {
        int x = 1;
        int y = 7;
        int respuesta = calculadoraInt.calculate(x, y);
        System.out.println(respuesta);

    }

    public static void engine(CalculadoraLong calculadoraLong) {
        long x = 1;
        long y = 7;
        long respuesta = calculadoraLong.calculate(x, y);
        System.out.println(respuesta);
    }
}
