package br.com.manualdaprogramacao.helpdesk.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/usuarios")
public class UsarioController {

    @PostMapping
    public ResponseEntity create(){

        System.out.println("Usuario Criado");
        return ResponseEntity.noContent().build();
    }
}
