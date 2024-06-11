package com.elhewazy.Simple.Task.Manager.API1.Dao;

import com.elhewazy.Simple.Task.Manager.API1.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarDao extends JpaRepository<Car,Integer> {

}
