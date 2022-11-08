package com.Pizza.Pizza.model;

import org.hibernate.annotations.BatchSize;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.*;

@Entity
public class Pizza {
    @Id
    @GeneratedValue
    @Column(name = "PIZZA_ID")
    private Long id;


    private String crust;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    @OrderBy




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
