package org.iesalandalus.programacion.poo.persona;

public class PruebaPersona {

    public static void main(String[] args) {
        Persona persona;
        DatosContacto.DireccionPostal direccionPostal = new DatosContacto.DireccionPostal("C/JR 1", "04004", "Almería");
        DatosContacto datosContacto = new DatosContacto("950112233", "jr@gmail.com", direccionPostal);
        DatosPersonales datosPersonales = new DatosPersonales("Alejandro Melero", "11X",  "01/01/2000");
        persona = new Persona(datosPersonales, datosContacto);
        System.out.println(persona);
    }
}