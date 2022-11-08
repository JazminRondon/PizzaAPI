package com.Pizza.Pizza.repository;

import com.Pizza.Pizza.model.Pizza;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PizzaRepository extends CrudRepository<Pizza, Long> {
}
