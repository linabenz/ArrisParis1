package com.projet.arrisparis.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})

@Controller
public class AcceuilController {


    @RequestMapping("/acceuil")
    public String afficheAcceuil(){
        return "acceuil";
    }
}
