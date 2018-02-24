/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.finalheorku;

import java.time.LocalDate;
import java.time.LocalTime;
import org.springframework.data.annotation.Id;

/**
 *
 * @author DavidUGP-Work
 */
public class Mensajito {
    @Id
     
    private String id;
    private String titulo;
    private String cuerpo;
    private LocalDate fecha;
    private LocalTime hr;
    
    public Mensajito() {
    }

    public Mensajito(String id, String titulo, String cuerpo, LocalDate fecha) {
        this.id = id;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        fecha=LocalDate.now();
        hr=LocalTime.now();
    }

    public Mensajito(String id, String titulo, String cuerpo, LocalDate fecha, LocalTime hr) {
        this.id = id;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        fecha=LocalDate.now();
        hr=LocalTime.now();
    }

    public Mensajito(String id, String titulo, String cuerpo) {
        this.id = id;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
    }

    
    
    public Mensajito(String id) {
        this.id = id;
    }

    public Mensajito(String titulo, String cuerpo) {
        
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        fecha=LocalDate.now();
        hr=LocalTime.now();
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHr() {
        return hr;
    }

    public void setHr(LocalTime hr) {
        this.hr = hr;
    }
}
