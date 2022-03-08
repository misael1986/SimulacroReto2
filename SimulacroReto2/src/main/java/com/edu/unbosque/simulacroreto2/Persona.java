/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.simulacroreto2;

import java.io.Serializable;

/**
 *
 * esta es una Clase PLANA, SENCILLA usada para el patrón de diseño
 * DTO
 * Clase ahora es serializable
 * 
 * @see Serializable 
 * @version 1.5
 * @author Yo
 * @since 2021
 *
 */
public class Persona implements Serializable{

    /*
    * Modificada por X persona para cumplir con el cliente Y
    *
    */
    private String nombre;
    private String apellidos;
    private long edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public long getEdad() {
        return edad;
    }

    /**
     * @param edad sirve para asignar un valor al parametro edad de la clase
     *
     */
    public void setEdad(long edad) {
        this.edad = edad;
    }

    /**
     * Constructor de la Clase como aparece en DTO
     *
     * @param nombre es para el nombre de la persona (Solo letras)
     * @param apellidos es para los apellidos de la persona (Solo letras)
     * @param edad para la edad de la persona
     */
    public Persona(String nombre, String apellidos, long edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
}
