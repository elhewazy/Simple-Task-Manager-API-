package com.elhewazy.Simple.Task.Manager.API1.servic;

import com.elhewazy.Simple.Task.Manager.API1.model.Car;

import java.util.List;

public interface CarServic {
    public List<Car> getAllCars();
    public Car getCarId(int id);
    public Car addCar(Car car);
    public void deleteCar(int id);
    public Car updateCar(Car car);

}
