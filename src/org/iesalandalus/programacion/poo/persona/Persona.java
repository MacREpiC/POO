package org.iesalandalus.programacion.poo.persona;

import java.util.Objects;

public class Persona {
    private DatosPersonales datosPersonales;
    private DatosContacto datosContacto;
    public Persona(DatosPersonales datosPersonales, DatosContacto datosContacto){
        setDatosPersonajes(datosPersonales);
        setDatosContacto(datosContacto);
    }
    public DatosPersonales getDatosPersonales(){
        return datosPersonales;
    }
    public void setDatosPersonajes(DatosPersonales datosPersonales){
        this.datosPersonales = Objects.requireNonNull(datosPersonales,"Los datos personales no pueden ser nulos");
    }
    public DatosContacto getDatosContacto(){
        return datosContacto;
    }
    public void setDatosContacto(DatosContacto datosContacto){
        this.datosContacto = Objects.requireNonNull(datosContacto, "Los datos de contacto no pueden ser nulos.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(datosPersonales, persona.datosPersonales) && Objects.equals(datosContacto, persona.datosContacto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datosPersonales, datosContacto);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "datosPersonales=" + datosPersonales +
                ", datosContacto=" + datosContacto +
                '}';
    }
}
