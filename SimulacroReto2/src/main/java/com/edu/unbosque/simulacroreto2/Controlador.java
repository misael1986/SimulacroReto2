/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.simulacroreto2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Misael Fdo Perilla - UNBOSQUE
 * @version 1.0.1 
 * @since 2021
 * @see ArrayList
 */
public class Controlador {

    Vista v;//Parametro para utilizar la vista y capturar/enviar datos al usuario
    ServiciosPersona m;

    Controlador(Vista vis, ServiciosPersona mod) {
        this.v = vis;
        this.m = mod;

        while (this.v.Menu() != 6) {//WHILE hace que le menu sea ciclico, 
            //Menu retorna los enteros capturados en la Vista
            this.Opciones();//invocar el metodo que conecta la vista-controlador
        }
        this.v.Mensajes("Hasta pronto");

    }

    public void Opciones() {
        switch (this.v.getOpcion()) {//Valida la entrada del entero en el Menu
            case 1://Ingresar Persona
                this.v.PedirDatos();
                int msj=this.m.LlenarLista(this.v.getNomRemp(),
                        this.v.getApeRemp(),
                        this.v.getEdadRem());
                if (msj==1){
                this.v.Mensajes("Se agregó la persona");
                }
                else {
                this.v.Mensajes("Hubo un problema, NO se agregó la persona");
                }
                break;
            case 2://Buscar Persona
                this.v.buscarApellido();
                this.v.ImprimirBuscado(this.m.buscarParticular(this.v.getApeRemp()));
                break;

            case 3://Este es para invocar a Modificar Persona
                this.v.buscarApellido();
                String b = this.v.getApeRemp();
                this.v.PedirDatos();
                this.m.modificarPersona(b, this.v.getNomRemp(),
                        this.v.getApeRemp(),
                        this.v.getEdadRem());
                this.v.Mensajes("Se modificó la persona");
                break;
            case 4://Eliminar Persona
                this.v.buscarApellido();
                this.m.borrarPersona(this.v.getApeRemp());
                this.v.Mensajes("Se eliminó la persona");
                break;
            case 5://Ver directorio de Persona
                ArrayList<Persona> personas = this.m.buscarTodos();
                String Todos = "El directorio de las personas\n";
                for (Persona p : personas) {//FOR asigna a 'p' cada uno de los 
                    //objetos en la lista 'personas'

                    Todos +="Nombre:"+ p.getNombre() + "\n " 
                            + p.getApellidos() + "\n" +
                            p.getEdad() + "\n\n";
                }
                this.v.Mensajes(Todos);
                break;

            default:
                this.v.Mensajes("Hasta pronto");
                break;
             
        }
    }

}
