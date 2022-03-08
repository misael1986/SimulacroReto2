/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.simulacroreto2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 * @version 1.5
 * 
 */
public class Vista {

    private int opcion;
    private long edadRem;
    private String nomRemp, apeRemp;

    Vista() {

    }

    /**
     * @return the opcion
     */
    public int getOpcion() {
        return opcion;
    }

    /**
     * @param opcion the opcion to set
     */
    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    /**
     * @return the edadRem
     */
    public long getEdadRem() {
        return edadRem;
    }

    /**
     * @param edadRem the edadRem to set
     */
    public void setEdadRem(long edadRem) {
        this.edadRem = edadRem;
    }

    /**
     * @return the nomRemp
     */
    public String getNomRemp() {
        return nomRemp;
    }

    /**
     * el parametro nomRemp es usado para asignarlo al atrubuto de la clase Vista,
     * que posteriormente será enviado al modelo del este proyecto
     * 
     * @param nomRemp recibe un String para ser asignado a this.nomRemp
     */
    public void setNomRemp(String nomRemp) {
        this.nomRemp = nomRemp;
    }

    /**
     * Explicar que retorna y para que se usa
     * 
     * @return el atributo apeRemp
     */
    public String getApeRemp() {
        return apeRemp;
    }

    /**
     * @param apeRemp the apeRemp to set
     */
    public void setApeRemp(String apeRemp) {
        this.apeRemp = apeRemp;
    }

    //---------------------------------------------------------  
    public int Menu() {

        Scanner menu = new Scanner(System.in);
        this.opcion = 0;

        System.out.println("INSTITUTO LA FLORESTA\n"
                + "Seleccione tarea a realizar:\n"
                + "1. Ingresar Persona\n"
                + "2. Buscar Persona\n"
                + "3. Modificar Persona\n"
                + "4. Eliminar Persona\n"
                + "5. Ver directorio de Persona\n"
                + "6. Salir\n"
                + "Opción:");
        this.opcion = menu.nextInt();

        return this.opcion;

    }

    public void PedirDatos() {
        Scanner menu = new Scanner(System.in);

        System.out.println("Ingresar persona\n"
                + "Ingresar nombres:");
        this.setNomRemp(menu.next());

        System.out.println("Ingresar apellidos:");
        this.setApeRemp(menu.next());

        System.out.println("Ingresar edad:");
        try {
            this.setEdadRem(menu.nextLong());//no hubo tiempo para validar la entrada de manera correcta
        } catch (Exception ernum) {
            System.out.println("Problema con la captura del numero: " + ernum.getMessage());
            this.setEdadRem(0);
        }

    }

    public void buscarApellido() {
        Scanner menu = new Scanner(System.in);
        System.out.println("Digite Apellido:");
        this.setApeRemp(menu.next());
    }

    public void Mensajes(String msj) {
        System.out.println(msj);
    }

    public void ImprimirBuscado(Persona buscada) {

        System.out.println("Encontrado: \n Nombre:" + buscada.getNombre()
                + "\n Apellidos: "
                + buscada.getApellidos() + "\nEdad: " + buscada.getEdad());

    }

}
