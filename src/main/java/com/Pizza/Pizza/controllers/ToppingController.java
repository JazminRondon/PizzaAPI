package com.Pizza.Pizza.controllers;

import com.Pizza.Pizza.repository.ToppingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToppingController {

    @Autowired
    private ToppingsRepository toppingsRepository;
}
