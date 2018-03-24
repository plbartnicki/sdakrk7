package com.klb.service;

import com.klb.entity.Car;

import java.util.List;

//CRUD
public interface CarService {
    public void add(Car car);
    public List<Car> getAll();
    public void remove(Car car);

    //ZAD DOM
    //public Car get();
}
