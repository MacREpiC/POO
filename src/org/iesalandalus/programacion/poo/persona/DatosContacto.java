package org.iesalandalus.programacion.poo.persona;

import java.util.Objects;

public class DatosContacto {
    private String telefono;
    private String email;
    private DireccionPostal direccionPostal;

    public DatosContacto(String telefono, String email, DireccionPostal direccionPostal) {
        setTelefono(telefono);
        setEmail(email);
        setDireccionPostal(direccionPostal);
    }

    public DatosContacto(DatosContacto datosContacto) {
        Objects.requireNonNull(datosContacto, "Los datos de contacto no pueden ser nulos.");
        setTelefono(datosContacto.telefono);
        setEmail(datosContacto.email);
        setDireccionPostal(datosContacto.direccionPostal);
    }
    public String getTelefono() {
        return telefono;
    }

    public void setDireccionPostal(DireccionPostal direccionPostal) {
        this.direccionPostal = direccionPostal;
    }

    public record DireccionPostal(String direccion, String codigoPostal, String localidad){
        public void validarDatos(String direccion, String codigoPostal, String localidad){
            Objects.requireNonNull(direccion, "La dirección no puede ser un valor nulo.");
            Objects.requireNonNull(codigoPostal, "La dirección postal no puede ser un valor nulo.");
            Objects.requireNonNull(localidad, "La localidad no puede ser un valor nulo.");
        }
    }
    public void setTelefono(String telefono) {
        this.telefono = Objects.requireNonNull(telefono, "El teléfono no puede ser nulo.");
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = Objects.requireNonNull(email, "El email no puede ser nulo.");
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DatosContacto that = (DatosContacto) o;
        return Objects.equals(telefono, that.telefono) && Objects.equals(email, that.email) && Objects.equals(direccionPostal, that.direccionPostal);
    }
    @Override
    public int hashCode() {
        return Objects.hash(telefono, email, direccionPostal);
    }
    @Override
    public String toString() {
        return "DatosContacto{" +
                "telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", direccionPostal=" + direccionPostal +
                '}';
    }
}