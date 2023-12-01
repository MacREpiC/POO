package org.iesalandalus.programacion.poo.pendrive;

import org.iesalandalus.programacion.utilidades.Entrada;

import javax.naming.OperationNotSupportedException;

public class Main {
    public static void main(String[] args) {
        System.out.println("----Pen Drive 1----");
        PenDrive penDrive1 = new PenDrive();
        System.out.println("Pen Drive 1 creado: " + penDrive1);
        try {
            System.out.print("Dime la cantidad de información que quieres escribir: ");
            penDrive1.escribir(Entrada.entero());
        } catch (IllegalArgumentException | OperationNotSupportedException e) {
            System.out.println("Erro al escribir: " + e.getMessage());
        }
        try {
            System.out.print("Dime la cantidad de información que quieres borrar: ");
            penDrive1.borrar(Entrada.entero());
        } catch (IllegalArgumentException | OperationNotSupportedException e){
            System.out.println("Erro al borrar: " + e.getMessage());
        }
        System.out.println("¿Está lleno el pendrive? " + penDrive1.estaLleno());
        System.out.println("¿Está vacío el pendrive? " + penDrive1.estaVacio());
        System.out.println("Capacidad disponible: " + penDrive1.getLibre());

        System.out.println("----------------------------------------------------------------------------");

        System.out.println("----Pen Drive 2----");
        PenDrive penDrive2 = new PenDrive();
        System.out.println("Pen Drive 2 creado: " + penDrive2);
        try {
            System.out.print("Dime la cantidad de información que quieres escribir: ");
            penDrive2.escribir(Entrada.entero());
        } catch (IllegalArgumentException | OperationNotSupportedException e) {
            System.out.println("Erro al escribir: " + e.getMessage());
        }
        try {
            System.out.print("Dime la cantidad de información que quieres borrar: ");
            penDrive2.borrar(Entrada.entero());
        } catch (IllegalArgumentException | OperationNotSupportedException e){
            System.out.println("Erro al borrar: " + e.getMessage());
        }
        System.out.println("¿Está lleno el pendrive? " + penDrive2.estaLleno());
        System.out.println("¿Está vacío el pendrive? " + penDrive2.estaVacio());
        System.out.println("Capacidad disponible: " + penDrive2.getLibre());
    }
}
