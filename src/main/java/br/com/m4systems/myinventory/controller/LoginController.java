package br.com.m4systems.myinventory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String abrirPaginaLogin(){
        return "login";
    }
}