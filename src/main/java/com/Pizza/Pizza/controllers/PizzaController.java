package com.Pizza.Pizza.controllers;


import com.Pizza.Pizza.model.Customer;
import com.Pizza.Pizza.model.Pizza;
import com.Pizza.Pizza.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;


    @PostMapping("/pizza/{customerId}/pizza")
    public void createPizza(@RequestBody Pizza pizza,@PathVariable Long customerId){
        pizzaService.createPizza(pizza, customerId);
    }

    @GetMapping("/pizza")
    public ResponseEntity<Iterable<Pizza>> getAllPizza(){

        return pizzaService.getAllPizza();
    }
    @GetMapping("pizza/{pizzaId}")
    public ResponseEntity<?> getPizzaId(@PathVariable long pizzaId) {

        return pizzaService.getPizzaById(pizzaId);
    }

    @PutMapping("/pizza/{customerId}/pizza")            //Valid
    public void updatePizza(@PathVariable (value = "customerId") Long customerId,@Valid @RequestBody Pizza pizza) {
        pizzaService.createPizza(pizza,customerId);
    }

        @DeleteMapping("/pizza/{pizzaId}")
        public void deletePizza(@PathVariable Long pizzaId){
        pizzaService.deletePizza(pizzaId);
        }


}
