package org.iesalandalus.programacion.poo.vehiculo;

import javax.naming.OperationNotSupportedException;
import java.util.Objects;

public class Deposito {
    public static final int CAPACIDAD_DEFECTO = 100;
    private int capacidad;
    private double contenido;
    public Deposito(){
        capacidad = CAPACIDAD_DEFECTO;
        contenido = 0;
    }
    public Deposito(int capacidad){
        this.capacidad = Objects.requireNonNull(capacidad, "La capacidad no puede ser nula");
    }
    public int getCapacidad(){
        return capacidad;
    }
    public double getContenido(){
        return contenido;
    }
    public boolean estaVacio(){
        return (contenido == 0);
    }
    public boolean estaLleno(){
        return (contenido == capacidad);
    }
    public void llenar(int litros) throws OperationNotSupportedException {
        if (litros <= 0) {
            throw new IllegalArgumentException("No puedes llenar una cantidad menor o igual que cero.");
        }
        if (litros > getCapacidad()) {
            throw new OperationNotSupportedException("No puedes llenar una cantidad mayor a la capacidad que tienes.");
        }
        if (estaLleno()) {
            throw new OperationNotSupportedException("No se puede repostar ya que el depósito está lleno.");
        }
        contenido += litros;
    }
    public void gastar(double litros) throws OperationNotSupportedException {
        if (litros <= 0) {
            throw new IllegalArgumentException("No puedes gastar una cantidad menor o igual que cero.");
        }
        if (litros > getCapacidad()) {
            throw new OperationNotSupportedException("No puedes llenar una cantidad mayor a la capacidad que tienes.");
        }
        contenido -= litros;
    }
}
