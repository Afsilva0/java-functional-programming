package org.example.programming.example11;

import java.util.Arrays;
import java.util.List;

public class Empleado implements  Comparable{

    String nombre;
    double sueldo;
    int edad;
    String departamento;


    public Empleado(String nombre, double sueldo, int edad, String departamento) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.edad = edad;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public static List<Empleado> generar(){
        return  Arrays.asList(
                new Empleado("Andres Silva", 35000, 24, "Tecnologia"),
                new Empleado("Paola", 26000, 23, "Diseño"),
                new Empleado("Juan", 46000, 30, "Tecnologia"),
                new Empleado("Leon", 15000, 18, "Servicio"),
                new Empleado("Pedro", 13000, 16, "Servicio"),
                new Empleado("Maria", 25000, 20, "Ventas"),
                new Empleado("Lucas", 9000, 35, "Servicio"),
                new Empleado("Maria", 30000, 45, "Ventas"),
                new Empleado("Maicol", 24000, 15, "Diseño")
        );
    }

    @Override
    public int compareTo(Object o) {
     return  this.getNombre().compareTo(((Empleado)o).getNombre());
    }
}
