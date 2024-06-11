package com.elhewazy.Simple.Task.Manager.API1.servic;

import com.elhewazy.Simple.Task.Manager.API1.Dao.CarDao;
import com.elhewazy.Simple.Task.Manager.API1.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServicImp implements CarServic{
    @Autowired
    public CarDao carDao;
    @Override
    public List<Car> getAllCars() {
        return this.carDao.findAll();
    }

    @Override
    public Car getCarId(int id) {
        Optional<Car> c = this.carDao.findById(id);
        Car car = null;
        if(c.isPresent())
        {
            car=c.get();
        }
        else {
            throw new RuntimeException("car Not Found :"+id);
        }

        return car;
    }

    @Override
    public Car addCar(Car car) {
        return this.carDao.save(car);
    }

    @Override
    public void deleteCar(int id) {
        this.carDao.deleteById(id);
    }

    @Override
    public Car updateCar(Car car) {
     return this.carDao.save(car);
    }
}
