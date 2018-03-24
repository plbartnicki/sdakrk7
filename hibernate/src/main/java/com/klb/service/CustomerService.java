package com.klb.service;

import com.klb.entity.Car;
import com.klb.entity.Customer;

import java.util.List;

/**
 * Created by klb on 24.03.18.
 */
public interface CustomerService {
    public void add(Customer car);
    public List<Customer> getAll();
    public void remove(Customer car);
}
