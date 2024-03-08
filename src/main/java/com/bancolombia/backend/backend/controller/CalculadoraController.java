package com.bancolombia.backend.backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.servlet.function.ServerResponse.status;

@RestController
@RequestMapping("/api/v1/calculadora")
public class CalculadoraController {

    /**Metodo1 Retorne un saludo*/
    @GetMapping
    public String saludo(){
        return "Welcome to comlombia Mr Daniel";
    }

    /**Metodo2 suma de dos valores*/
    @GetMapping("/sumar-valor")
    public double sumar(@RequestParam("valor1") double valor1,@RequestParam("valor2") double valor2){
        return valor1+valor2;
    }
    @GetMapping("/dividir-valor")
    public ResponseEntity dividir(@RequestParam("valor1") double valor1,@RequestParam("valor2") double valor2){
       if (valor2 != 0){
           double resultado = valor1/valor2;
           return ResponseEntity
                   .status(HttpStatus.OK)
                   .body(resultado);
       }

        return ResponseEntity.
                status(HttpStatus.OK).
                body("No se puede dividir por 0");
    }
    @GetMapping("/{name}")
    public String saludoBancolombia(@PathVariable String name){
        return "Welcome to comlombia Mr " + name;
    }

    @GetMapping("/name")
    public String saludoBanco(@RequestParam("name") String name){
        return "Welcome to comlombia Mr " + name;
    }



}
