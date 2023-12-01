package org.iesalandalus.programacion.poo.vehiculo;

public class CuentaKilometros {
    private int kilometros;

    public CuentaKilometros() {
        kilometros = 0;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void avanzar() {
        if (kilometros <= 0) {
            throw new IllegalArgumentException("Los kilómetros que quieres avanzar no pueden ser menor o igual que cero.");
        }
    }
}