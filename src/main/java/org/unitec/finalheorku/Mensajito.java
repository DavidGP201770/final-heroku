/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.finalheorku;

import org.springframework.data.annotation.Id;

/**
 *
 * @author DavidUGP-Work
 */
public class Mensajito {
    @Id
     
    private Integer id;
    
    private String titulo;
    private String cuerpo;

    public Mensajito() {
    }

    public Mensajito(Integer id) {
        this.id = id;
    }

    public Mensajito(Integer id, String titulo, String cuerpo) {
        
        this.titulo = titulo;
        this.cuerpo = cuerpo;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }
}
