/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.simulacroreto2;

/**
 * Reto 2 mejorado para ser parecido al reto 3
 * 
 * @author Usuario
 * @version 1.5
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Controlador control= new Controlador(new Vista(),new ServiciosPersona());
        //                                                    Modelo usando DTO
        
        /*Pelicula perros = new Pelicula();
        perros.crearPelicula();
        perros.mostrarPelicula();
        
        Pelicula arma= new Pelicula();
        arma.crearPelicula();
        arma.mostrarPelicula();
        
        perros.anho=1201;
        */
        
    }
    
}
