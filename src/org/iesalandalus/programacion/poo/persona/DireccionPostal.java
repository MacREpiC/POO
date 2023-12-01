package org.iesalandalus.programacion.poo.persona;

import java.util.Objects;

public class DireccionPostal {
    private String direccion;
    private String codigoPostal;
    private String localidad;
    public DireccionPostal(String direccion, String codigoPostal, String localidad) {
        setDireccion(direccion);
        setCodigoPostal(codigoPostal);
        setLocalidad(localidad);
    }
    public DireccionPostal(DireccionPostal direccionPostal) {
        Objects.requireNonNull(direccionPostal, "La dirección postal no puede ser nula.");
        setDireccion(direccionPostal.direccion);
        setCodigoPostal(direccionPostal.codigoPostal);
        setLocalidad(direccionPostal.localidad);
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = Objects.requireNonNull(direccion, "La dirección no puede ser un valor nulo");
    }
    public String getCodigoPostal(){
        return codigoPostal;
    }
    public void setCodigoPostal(String codigoPostal){
        this.codigoPostal = Objects.requireNonNull(codigoPostal,"El código postal no puede ser un valor nulo.");
    }
    public String getLocalidad(){
        return localidad;
    }
    public void setLocalidad(String localidad){
        this.localidad = Objects.requireNonNull(localidad,"El código postal no puede ser un valor nulo.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DireccionPostal that = (DireccionPostal) o;
        return Objects.equals(direccion, that.direccion) && Objects.equals(codigoPostal, that.codigoPostal) && Objects.equals(localidad, that.localidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direccion, codigoPostal, localidad);
    }

    @Override
    public String toString() {
        return "DireccionPostal{" +
                "direccion='" + direccion + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", localidad='" + localidad + '\'' +
                '}';
    }
}
