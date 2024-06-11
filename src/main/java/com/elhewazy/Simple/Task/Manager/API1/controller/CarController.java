package com.elhewazy.Simple.Task.Manager.API1.controller;

import com.elhewazy.Simple.Task.Manager.API1.model.Car;
import com.elhewazy.Simple.Task.Manager.API1.servic.CarServicImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {
    @Autowired
    CarServicImp cs;

    @GetMapping("/")
    public String printS(){

        return "<h1>hello my app</h>";
    }

    @GetMapping("/getAll")
    public List<Car> getAll(){
        return this.cs.getAllCars();
    }
    @PostMapping("/addCar")
    public Car addCar(@RequestBody Car car){
        return this.cs.addCar(car);
    }
    @PutMapping("/updateCar")
    public Car updateCar(@RequestBody Car car){
       return this.cs.updateCar(car);
    }
    @DeleteMapping("/deleteCar/{id}")
    public String deleteCar(@PathVariable int id){

        this.cs.deleteCar(id);
        return "deleted successfully";
    }
}
