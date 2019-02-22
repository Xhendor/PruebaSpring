package com.uabc.edu.mx.pruebaspring.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/app")
public class PageController {

    @GetMapping(value = "/recurso")
    public String index(){

        return "Hola, soy un rest";
    }


}
