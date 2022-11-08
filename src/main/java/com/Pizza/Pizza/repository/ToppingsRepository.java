package com.Pizza.Pizza.repository;

import com.Pizza.Pizza.model.Toppings;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ToppingsRepository extends CrudRepository<Toppings,Long> {
}
