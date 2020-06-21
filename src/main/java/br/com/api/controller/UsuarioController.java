package br.com.api.controller;

import br.com.api.dto.GreetingDTO;
import br.com.api.dto.UsuarioDTO;
import br.com.api.servico.JwtUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class UsuarioController {

    @Autowired
    JwtUserDetailsService jwtUserDetailsService;

    @GetMapping({ "/hello" })
    public String firstPage() {
        return "Hello there!";
    }

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public GreetingDTO greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new GreetingDTO(counter.incrementAndGet(), String.format(template, name));
    }

    @PostMapping(value = "/create")
    public ResponseEntity<?> createUser(@RequestBody UsuarioDTO userDto) {
        jwtUserDetailsService.save(userDto);
        return ResponseEntity.ok("created");
    }
}
