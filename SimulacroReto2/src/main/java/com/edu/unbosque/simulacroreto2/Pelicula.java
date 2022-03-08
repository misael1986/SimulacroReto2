/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.simulacroreto2;

import java.util.Scanner;

/**
 * @version 1.0
 * @author Usuario
 */
public class Pelicula {//Nombre
    
    //Atributos
    public String Nombre;//Encapsulamiento  PUBLICO -> CUALQUIERA
    protected int anho; //  -> SOLO los del Mismo Package
    private String genero;// Nadie 
    private String director;
    
    
    public Pelicula(){
    
    }
    
    //Metodos
    public void crearPelicula(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Nombre de la Pelicula");
        this.setNombre(entrada.nextLine());
        System.out.println("A\u00F1o de la Pelicula");
        this.setAnho(entrada.nextInt());
        System.out.println("G\u00E9nero de la Pelicula");
        this.setNombre(entrada.nextLine());
        System.out.println("Director de la Pelicula");
        this.setNombre(entrada.nextLine());
        
    }
    
    public void mostrarPelicula(){
        System.out.println("NOmbre: "+this.getNombre());
        System.out.println("A\u00F1o: "+this.getAnho());
        System.out.println("G\u00E9nero: "+this.getGenero());
         System.out.println("Director: "+this.getDirector());
        
    }

    /**
     * @return the Nombre a la clase que lo llama
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre y lo asigna al atributo nombre de la clase
     * 
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the anho
     */
    public int getAnho() {
        return anho;
    }

    /**
     * @param anho the anho to set
     */
    public void setAnho(int anho) {
        this.anho = anho;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the director
     */
    public String getDirector() {
        return director;
    }

    /**
     * @param director the director to set
     */
    public void setDirector(String director) {
        this.director = director;
    }
    
    
}
