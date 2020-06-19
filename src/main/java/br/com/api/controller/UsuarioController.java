package br.com.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @RequestMapping({ "/hello" })
    public String firstPage() {
        return "Hello there!";
    }
}
