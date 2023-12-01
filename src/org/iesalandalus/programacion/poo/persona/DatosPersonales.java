package org.iesalandalus.programacion.poo.persona;

import java.util.Objects;

public class DatosPersonales {
    private String nombre;
    private String dni;
    private String fechaNacimiento;
    public DatosPersonales(String nombre, String dni, String fechaNacimiento){
        setNombre(nombre);
        setDni(dni);
        setFechaNacimiento(fechaNacimiento);
    }
    public DatosPersonales(DatosPersonales datosPersonales) {
        Objects.requireNonNull(datosPersonales, "Los datos personales no pueden ser nulos.");
        setNombre(datosPersonales.nombre);
        setDni(datosPersonales.dni);
        setFechaNacimiento(datosPersonales.fechaNacimiento);
    }
    public String getDni() {
        return dni;
    }
    public String getNombre(){
        return dni;
    }
    public String getFechaNacimiento(){
        return  fechaNacimiento;
    }
    public void setDni(String dni) {
        this.dni = Objects.requireNonNull(dni, "El DNI no puede ser un campo nulo");
    }
    public void setNombre(String Nombre) {
        this.nombre = Objects.requireNonNull(Nombre, "El nombre no puede ser un campo nulo");
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = Objects.requireNonNull(fechaNacimiento, "La fecha de nacimiento no puede ser un campo nulo");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DatosPersonales that = (DatosPersonales) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(dni, that.dni) && Objects.equals(fechaNacimiento, that.fechaNacimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, dni, fechaNacimiento);
    }

    @Override
    public String toString() {
        return "DatosPersonales{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }
}
