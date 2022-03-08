/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.simulacroreto2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 * 
 */
public class ServiciosPersona {

    ArrayList<Persona> lista;//TODO queda acá guardado (BD Imaginaria)

    ServiciosPersona() {
        /*
        this.lista = new ArrayList<Persona>();
        */
        this.lista = this.Leer();

    }

    //------------LISTAR a TODOS---------------------------------------
    public ArrayList<Persona> buscarTodos() {//retorna la lista entera
        return this.lista;
    }

    //------------CREEAR UNA PERSONA Y AGREGARLA---------------------------------------
    public int LlenarLista(String nom, String ape, long edad) {
        int exito = 0;//bandera de si el proceso de guardado fue exitoso 
        try {
            Persona p = new Persona(nom, ape, edad);
            this.lista.add(p);//append en Python
            this.Guardar(this.lista);
            exito = 1;
        } catch (Exception ep) {
            System.out.println("Error al guardar persona: " + ep.getMessage());

        }
        return exito;

    }

    //------------BUSCAR A ALGUIEN ESPECIFICO---------------------------------------
    public Persona buscarParticular(String ape) {
        Persona res = null;
        try {
            for (Persona p : this.lista) {
                if (p.getApellidos().equals(ape)) {
                    res = p;
                }

            }
        } catch (Exception e) {
            System.err.println("Error al buscar: " + e.getMessage());

        } finally {
            if (res == null) {
                res = new Persona("No", "Está", 0);
            }

        }

        return res;
    }

    //------------MODIFICA A PERSONA---------------------------------------
    public void modificarPersona(String ape, String A, String B, long C) {
        int pos = 0;
        try {
            for (Persona p : lista) {

                if (p.getApellidos().equals(ape)) {
                    String Nombre=p.getNombre();//Crear variables Temporales

                    Persona pNuevo = new Persona(Nombre, B, C);//Viejo + Nuevo
                    this.lista.set(pos, pNuevo);
                    this.Guardar(this.lista);
                }
                pos++;

            }
        } catch (Exception e) {
            System.err.println("Error al buscar: " + e.getMessage());

        }

    }

    //------------BORRAR A PERSONA---------------------------------------
    public void borrarPersona(String ape) {
        try {
            for (Persona p : lista) {

                if (p.getApellidos().equals(ape)) {
                    this.lista.remove(p);
                    this.Guardar(this.lista);
                }
            }
        } catch (Exception ex) {
            System.err.println("Error al borrar:" + ex.getMessage());
        }
    }

    //------------GUARDADO de la LISTA en .DAT-------------------------------
    private void Guardar(ArrayList<Persona> G) {
        FileOutputStream archivo = null;//Archivo para Guardar -> Out -> Salir

        try {
            archivo = new FileOutputStream("datos_estudiantes.dat");
            ObjectOutputStream canal = new ObjectOutputStream(archivo);
            canal.writeObject(G);
        } catch (IOException e) {//Se deben usar varios catch para los posibles errores como IO, FileNotFound
            System.out.println("Error al Guardar los datos" + e.getMessage());
            e.printStackTrace();//Arbol de errores
        } finally {
            try {
                archivo.close();//cerrar es importante
            } catch (Exception ec) {
                ec.printStackTrace();
            }

        }

    }

    //------------LEER el .DAT y cargarlo en la LISTA-----------------------
    private ArrayList<Persona> Leer() {
        ArrayList<Persona> BD = null;
        FileInputStream lectura = null;//In -> Entrar -> Leer

        try {
            lectura = new FileInputStream("datos_estudiantes.dat");
            ObjectInputStream canalLectura = new ObjectInputStream(lectura);
            BD = (ArrayList<Persona>) canalLectura.readObject();

        } catch (Exception lec) {
            System.out.println("Error al tratar de pasar de .dat a Objects"
                    + lec.getMessage());
            lec.printStackTrace();
        }
        if (BD == null) {
            BD = new ArrayList<Persona>();
        }
        return BD;
    }

   

}
