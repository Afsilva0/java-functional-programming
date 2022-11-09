package org.example.programming.example7;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class Evaluador {

    List<Empleado> evaluar(List<Empleado> listEmpleado, BiPredicate<Integer, String> eval) {
        List<Empleado> listaNueva = new ArrayList<>();

        for (Empleado empleado:listEmpleado){
            if(eval.test(empleado.getEdad(),empleado.getDepartamento())){
                listaNueva.add(empleado);
            }
        }

        return  listaNueva;
    }
}
