package com.klb.service;


import com.klb.connector.DBConnector;
import com.klb.entity.Car;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class CarServiceImpl implements CarService {

    private DBConnector dbc;

    public CarServiceImpl(DBConnector dbc) {
        this.dbc = dbc;
    }

    //dodanie i update
    public void add(Car car) {
        Session session = dbc.getSession();
        session.save(car);
    }

    public List<Car> getAll() {
        Session session = dbc.getSession();
        Query query = session.createQuery("FROM Car C");
        return query.list();
    }

    public void remove(Car car) {
        Session session = dbc.getSession();
        session.beginTransaction();
        session.delete(car);
        session.getTransaction().commit();
    }
}
