package org.iesalandalus.programacion.poo.vehiculo;

import org.iesalandalus.programacion.utilidades.Entrada;

import javax.naming.OperationNotSupportedException;

public class Main {
    public static void main(String[] args) {
        System.out.println("----Coche 1----");
        Vehiculo vehiculo1 = new Vehiculo("Peugeat", "Eléctrico");
        System.out.print("Dime la capacidad de tu vehículo:");
        int capacidad = Entrada.entero();
        System.out.print("Dime el consumo de tu vehículo: ");
        double consumo = Entrada.entero();
        System.out.println(vehiculo1);
        utilizarVehiclo(vehiculo1);
    }
    private static void utilizarVehiclo(Vehiculo vehiculo){
        try {
            System.out.print("Dime los litros a repostar: ");
            int litros = Entrada.entero();
            vehiculo.repostar(litros);
            System.out.println(vehiculo);
            System.out.print("Dime los kilómetros a avanzar: ");
            int kilometros = Entrada.entero();
            vehiculo.avanzar(kilometros);
            System.out.println(vehiculo);
        } catch (OperationNotSupportedException e) {
            System.out.println(e.getMessage());
        }
    }
}
