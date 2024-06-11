package com.elhewazy.Simple.Task.Manager.API1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
   private String model;
    private String carYear;
    private String brand;
    private boolean  avelable;

    public Car(String model, String year, String brand, boolean avelable) {
        this.model = model;
        this.carYear = year;
        this.brand = brand;
        this.avelable = avelable;
    }
}
