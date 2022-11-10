package org.example.programming.example11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class MainStringFunction {

    public static void main(String[] args) {

        List<Empleado> listaEmpleado = Empleado.generar();

        System.out.println("Empleados mayores de 20 años ordenados por nombre");
        listaEmpleado.stream()
                .filter((emp) -> emp.getEdad() > 20)
                .sorted()
                .forEach(emp -> System.out.println(emp.getNombre() + " " + emp.getEdad()));


        System.out.println("\n Empleados mayores de 20 años y que ganas mas de 15.000 ordenados por nombre");

        Predicate<Empleado> empMayor20 = (emp) -> emp.getEdad() > 20;
        Predicate<Empleado> empGanaMas15 = (emp) -> emp.getSueldo() > 15000;
        Predicate<Empleado> empMayor20GanaMas15 = empMayor20.and(empGanaMas15);

        listaEmpleado.stream()
                .filter(empMayor20GanaMas15)
                .sorted()
                .forEach(emp -> System.out.println(emp.getNombre() + " " + emp.getEdad() + " " + emp.getSueldo()));


        System.out.println("\n Empleados ordenados por edad ADS");


        listaEmpleado.stream()
                .sorted((emp1, emp2) -> emp1.getEdad() - emp2.getEdad())
                .forEach(emp -> System.out.println(emp.getNombre() + " " + emp.getEdad()));


        System.out.println("\n Empleados ordenados por edad DES");


        listaEmpleado.stream()
                .sorted((emp1, emp2) -> emp2.getEdad() - emp1.getEdad())
                .forEach(emp -> System.out.println(emp.getNombre() + " " + emp.getEdad()));


        /* Stream Reduce terminal */

        int[] numbers = new int[]{2, 3, 1, 5, 6, 34, 46, 45, 23, 14, 3, 7, 4, 5, 7};

        System.out.println("Suma de los valores");
        System.out.println(Arrays.stream(numbers).sum());

        System.out.println("Valor promedio");
        System.out.println(Arrays.stream(numbers).average().getAsDouble());

        System.out.println("Valor maximo");
        System.out.println(Arrays.stream(numbers).max().getAsInt());

        System.out.println("Valor minimo");
        System.out.println(Arrays.stream(numbers).min().getAsInt());

        System.out.println("Cantidad de elementos");
        System.out.println(Arrays.stream(numbers).count());


        /* Tambien se puede usar los reduce para las colleciones agregando función personalizada */
        Empleado empleadoMayorSueldo = listaEmpleado.stream()
                .max((emp1, emp2) -> (int) (emp1.getSueldo() - emp2.getSueldo())).get();
        System.out.println("Empleado mayor sueldo");
        System.out.println(empleadoMayorSueldo.getNombre() + " " + empleadoMayorSueldo.getSueldo());


        /* Collect para generar tipos de datos
        List
        Set
         */
        List<String> list = List.of("Hola", "Amigo", "Que", "Tal?");

        List<String> list1 = list.stream().collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        System.out.println(list1);


        List<String> list2 =list.stream().collect(Collectors.toList());
        System.out.println(list2);


        Set<String> list3 = list.stream().collect(Collectors.toSet());
        System.out.println(list3);
    }
}
