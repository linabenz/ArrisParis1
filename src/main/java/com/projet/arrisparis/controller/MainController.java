package com.projet.arrisparis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
    @GetMapping(value = "/login")
    public String login(){
        return "login";
    }
    @GetMapping(value = "/")
    public String home(){
        return "index";
    }
    @RequestMapping("/acceuil")
    public String afficheAcceuil(){
        return "acceuil";
    }
    @RequestMapping("/panierr")
    public String affichePanier(){
        return "panier";
    }
}
