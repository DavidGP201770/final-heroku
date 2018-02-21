/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.finalheorku;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DavidUGP-Work
 */
@RestController
@RequestMapping("/api")

public class ControladorMensajes {
    
    @Autowired RepositorioMensajito repoMensa;
    
    @RequestMapping(value="/mensajito", method=RequestMethod.GET,headers={"Accept=application/json"})
    public ArrayList<Mensajito> hola(){
        
        return (ArrayList<Mensajito>) repoMensa.findAll(); 
    }
}


