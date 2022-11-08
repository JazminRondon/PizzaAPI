package com.Pizza.Pizza.controllers;


import com.Pizza.Pizza.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;


}
