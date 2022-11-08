package com.Pizza.Pizza.service;

import com.Pizza.Pizza.model.Customer;
import com.Pizza.Pizza.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;


    public void addCustomer(Customer customer){
        customerRepository.save(customer);
    }
    public ResponseEntity<Iterable<Customer>> getAllCustomers(){
        Iterable<Customer> allCustomers= customerRepository.findAll();
        return new ResponseEntity<>(allCustomers, HttpStatus.OK);
    }

    public Optional<Customer> getCustomerById(Long id){

        return customerRepository.findById(id);
    }
    public ResponseEntity<?> updateCategory(Customer customer, Long customerId) {
        Customer c = customerRepository.save(customer);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
