package com.Sumador.Sumador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SumadorController {

    @GetMapping("/sumar")
    public int sumar(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }
}
