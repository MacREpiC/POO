package org.iesalandalus.programacion.poo.vehiculo;

import javax.naming.OperationNotSupportedException;
import java.util.Objects;

public class Vehiculo {
    public static final int CONSUMO_DEFECTO = 10;
    private final String marca;
    private final String modelo;
    private double consumo;
    private final CuentaKilometros cuentakilometros;
    private Deposito deposito;

    public Vehiculo(String marca, String modelo) {
        this.marca = Objects.requireNonNull(marca, "La marca no puede ser nula.");
        this.modelo = Objects.requireNonNull(modelo, "El modelo no puede ser nulo.");
        consumo = CONSUMO_DEFECTO;
        cuentakilometros = new CuentaKilometros();
        deposito = new Deposito();
    }

    public Vehiculo(String marca, String modelo, int capacidadDeposito, double consumo) {
        this(marca, modelo);
        deposito = new Deposito(capacidadDeposito);
        setConsumo(consumo);
    }

    private void setConsumo(double consumo) {
        if (consumo < 0) {
            throw new IllegalArgumentException("El consumo no puede ser menor que cero.");
        }
        this.consumo = consumo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public CuentaKilometros getCuentakilometros() {
        return cuentakilometros;
    }

    private void avanzar() throws OperationNotSupportedException {
        try {
            deposito.gastar(consumo / 100);
            cuentakilometros.avanzar();
        } catch (IllegalArgumentException | OperationNotSupportedException e) {
            throw new OperationNotSupportedException("Error al avanzar: " + e.getMessage());
        }
    }
    public void avanzar(int kilometros) throws OperationNotSupportedException {
        if (kilometros <= 0) {
            throw new IllegalArgumentException("Se debe avanzar al menos un kilómetro.");
        }
        for (int i = 0; i < kilometros; i++) {
            avanzar();
        }
    }
    public void repostar(int litros) throws OperationNotSupportedException {
        try {
            deposito.llenar(litros);
        } catch (IllegalArgumentException | OperationNotSupportedException e) {
            throw new OperationNotSupportedException("Error al repostar: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return String.format("Vehiculo[marca=%s, modelo=%s, consumo=%s, kilómetros=%s, combustible=%.2f]", marca, modelo, consumo, cuentakilometros.getKilometros(), deposito.getContenido());
    }
}
