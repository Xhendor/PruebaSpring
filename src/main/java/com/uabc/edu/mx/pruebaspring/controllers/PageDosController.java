package com.uabc.edu.mx.pruebaspring.controllers;


import com.uabc.edu.mx.pruebaspring.model.Gato;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class PageDosController {

    @GetMapping(value = "/recurso")
    public String pagina(Model modelo){

        Gato donGato=new Gato();
        donGato.setEdad(50f);
        donGato.setNombre("DonGato");
        donGato.setRaza("Siames");
        donGato.setVivo(true);
        modelo.addAttribute("myGato",donGato);

        return "pagina";
    }
}
