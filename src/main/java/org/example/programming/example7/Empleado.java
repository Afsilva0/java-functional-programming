package org.example.programming.example7;

public class Empleado {

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
}
