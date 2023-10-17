package com.flowers.flower;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class FlowerEntity {
    
    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String description;
    private Double value;
}
