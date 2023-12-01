package org.iesalandalus.programacion.poo.pendrive;

import javax.naming.OperationNotSupportedException;
import java.util.Objects;

public class PenDrive {
    private String fabricante;
    private int capacidad;
    private int ocupado;
    public static final String FABRICANTE_DESCONOCIDO = "Desconodico";
    public static final int CAPACIDAD_MINIMA = 64;
    public static final int CAPACIDAD_MAXIMA = 1024;

    public PenDrive() {
        fabricante = FABRICANTE_DESCONOCIDO;
        capacidad = 64;
        ocupado = 0;
    }

    public PenDrive(String fabricante, int capacidad) {
        setFabricante(fabricante);
        setCapacidad(capacidad);
        ocupado = 0;
    }

    public String getFabricante() {
        return fabricante;
    }

    private void setFabricante(String fabricante) {
        this.fabricante = Objects.requireNonNull(fabricante, "El nombre del fabricante no puede ser nulo.");
    }

    private void setCapacidad(int capacidad) {
        if (capacidad < CAPACIDAD_MINIMA) {
            throw new IllegalArgumentException("La capacidad no puede ser menor que cero.");
        }
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getOcupado() {
        return ocupado;
    }

    public int getLibre() {
        return capacidad - ocupado;
    }

    public boolean estaVacio() {
        return (ocupado == 0);
    }

    public boolean estaLleno() {
        return (ocupado == capacidad);
    }

    public void escribir(int cantidad) throws OperationNotSupportedException {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("No puedes escribir sobre el pendrive un número menor que cero.");
        }
        if (cantidad > getLibre()){
            throw new OperationNotSupportedException("No puedes escribir sobre el pendrive una cantidad superior de almacenamiento disponible.");
        }
        ocupado += cantidad;
    }

    private int leer(int cantidad) throws OperationNotSupportedException {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("Debes de leer algo.");
        }
        if (cantidad > ocupado) {
            throw new OperationNotSupportedException("La cantidad a leer a ingresar no puede ser superior a la del espacio ocupado.");
        }
        return cantidad;
    }

    public void borrar(int cantidad) throws OperationNotSupportedException {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("Debes de borrar algo.");
        }
        if (cantidad > ocupado) {
            throw new OperationNotSupportedException("La cantidad a borrar no puede ser superior a la del espacio ocupado.");
        }
        ocupado -= cantidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PenDrive penDrive = (PenDrive) o;
        return capacidad == penDrive.capacidad && ocupado == penDrive.ocupado && Objects.equals(fabricante, penDrive.fabricante);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fabricante, capacidad, ocupado);
    }

    @Override
    public String toString() {
        return "PenDrive{" +
                "fabricante='" + fabricante + '\'' +
                ", capacidad=" + capacidad +
                ", ocupado=" + ocupado +
                '}';
    }
}
