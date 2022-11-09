package com.Pizza.Pizza.service;

import com.Pizza.Pizza.model.Pizza;
import com.Pizza.Pizza.repository.CustomerRepository;
import com.Pizza.Pizza.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PizzaService {

    @Autowired
    PizzaRepository pizzaRepository;

    @Autowired
    CustomerRepository customerRepository;


    public void createPizza(Pizza pizza, Long customerId) {
        customerRepository.findById(customerId).map(customer -> {
            pizza.setCustomer(customer);
            return pizzaRepository.save(pizza);

        });


    }

    public ResponseEntity<Iterable<Pizza>> getAllPizza(){
        Iterable<Pizza> allPizza= pizzaRepository.findAll();
        return new ResponseEntity<>(allPizza, HttpStatus.OK);
    }

    public ResponseEntity<?> getPizzaById(Long pizzaId) {
        Optional<Pizza> pizza = pizzaRepository.findById(pizzaId);
        return new ResponseEntity<>(pizza, HttpStatus.OK);
    }

    public void updatePizza(Pizza pizza, Long customerId) {
        customerRepository.findById(customerId).map(customer -> {
            pizza.setCustomer(customer);
            return pizzaRepository.save(pizza);

        });
    }


    public void deletePizza(Long pizzaId){
        pizzaRepository.deleteById(pizzaId);
    }


}
