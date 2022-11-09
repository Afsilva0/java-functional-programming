package org.example.programming.example7;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class MainBiPredicate {

    /* Se requiere un reporte con todos los empleados que cumplan
     * Con alguno de estos criterios:
     * 1) 20 años en adelante y que esten en el de partamento de servicio
     * 2) 20 años en adelante y que esten en tecnologia
     */

    public static void main(String[] args) {

        List<Empleado> listaEmpleados = Arrays.asList(
                new Empleado("Andres Silva", 35.000, 24, "Tecnologia"),
                new Empleado("Paola", 26.000, 15, "Diseño"),
                new Empleado("Juan", 46.000, 15, "Tecnologia"),
                new Empleado("Pedro", 13.000, 16, "Servicio"),
                new Empleado("Leon", 15.000, 18, "Servicio"),
                new Empleado("Maria", 25.000, 20, "Ventas"),
                new Empleado("Lucas", 9.000, 35, "Servicio"),
                new Empleado("Maria", 30.000, 45, "Ventas"),
                new Empleado("Maicol", 24.000, 15, "Diseño")
        );

        Evaluador evaluador = new Evaluador();

        BiPredicate<Integer, String> primerCriterio = (edad, departamento) -> (edad >= 20) && (departamento.equals("Servicio"));

        BiPredicate<Integer, String> segundoCriterio = (edad, departamento) -> (edad >= 20) && (departamento.equals("Tecnologia"));


        BiPredicate<Integer, String> criterios = primerCriterio.or(segundoCriterio);
        System.out.println("Empleados servicio o ventas mayores a 20 años");


        List<Empleado> listaFiltrada = evaluador.evaluar(listaEmpleados, criterios);


        for (Empleado empleado : listaFiltrada) {
            System.out.println("Nombre: " + empleado.getNombre() +
                    " Edad: " + empleado.getEdad() +
                    " Departamento: " + empleado.getDepartamento());
        }

    }
}
