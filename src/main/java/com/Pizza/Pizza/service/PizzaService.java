package com.Pizza.Pizza.service;

import com.Pizza.Pizza.model.Customer;
import com.Pizza.Pizza.model.Pizza;
import com.Pizza.Pizza.repository.CustomerRepository;
import com.Pizza.Pizza.repository.PizzaRepository;
import com.Pizza.Pizza.repository.ToppingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzaService {

    @Autowired
    PizzaRepository pizzaRepository;
    @Autowired
    CustomerRepository customerRepository;

//    public void createPizzaOrder(Pizza pizza, Customer customer) {
//        customerRepository.getId(customer).map(category -> {
//            pizza.setCustomer(customer);
//            return pizzaRepository.save(pizza);
//
//        });
//
//
//    }

}
