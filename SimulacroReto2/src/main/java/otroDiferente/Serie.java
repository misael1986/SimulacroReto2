/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otroDiferente;

/**
 *
 * @author MFPB
 * @since 1.0
 * @version 1.1

 */
public class Serie {
    
 /**
 * @param titulo es usado para guardar el nombre de la serie en su idioma original
 * @param titulotrad es usado para guardar el tituto traducido de la serie
 */
    
    private String titulo,titulotrad;
    private int temporadas;

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the temporadas
     */
    public int getTemporadas() {
        return temporadas;
    }

    /**
     * @param temporadas the temporadas to set
     */
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    /**
     * @return the titulotrad
     */
    public String getTitulotrad() {
        return titulotrad;
    }

    /**
     * @param titulotrad the titulotrad to set
     */
    public void setTitulotrad(String titulotrad) {
        this.titulotrad = titulotrad;
    }
    
}
