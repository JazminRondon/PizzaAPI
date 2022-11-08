package com.Pizza.Pizza.controllers;


import com.Pizza.Pizza.model.Customer;
import com.Pizza.Pizza.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/customer")
    public void addCustomer(@RequestBody Customer customer){
        customerService.addCustomer(customer);
    }
    @GetMapping("/customers")
    public ResponseEntity<?> getAllCustomers(){

        return customerService.getAllCustomers();
    }

    @GetMapping("/customer/{id}")
    public Optional<Customer> getCustomerById(@PathVariable Long id){

        return customerService.getCustomerById(id);
    }

}