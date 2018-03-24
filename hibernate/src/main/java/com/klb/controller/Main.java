package com.klb.controller;


import com.klb.connector.DBConnector;
import com.klb.entity.Car;
import com.klb.entity.Customer;
import com.klb.service.CarService;
import com.klb.service.CarServiceImpl;
import com.klb.service.CustomerService;
import com.klb.service.CustomerServiceImpl;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        DBConnector conn = DBConnector.getInstance();
        CarService cs = new CarServiceImpl(conn);
        CustomerService custs = new CustomerServiceImpl(conn);

//        Car c1 = new Car("BMW", false );
//        Car c2 = new Car("dsdcd", true );
//        cs.add(c1);
//        cs.add(c2);

//        List<Car> cars = cs.getAll();
//        System.out.println(cars.toString());

//        Customer cust1 = new Customer("Customer 1");
//        Customer cust2 = new Customer("Agnieszka");
//        custs.add(cust1);
//        custs.add(cust2);

        List<Customer> customers = custs.getAll();
        System.out.println(customers);

        conn.close();
    }
}
