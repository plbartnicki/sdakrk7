package com.klb.service;

import com.klb.connector.DBConnector;
import com.klb.entity.Car;
import com.klb.entity.Customer;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by klb on 24.03.18.
 */
public class CustomerServiceImpl implements CustomerService {
    private DBConnector dbc;

    public CustomerServiceImpl(DBConnector dbc) {
        this.dbc = dbc;
    }

    //dodanie i update
    public void add(Customer cust) {
        Session session = dbc.getSession();
        session.save(cust);
    }

    public List<Customer> getAll() {
        Session session = dbc.getSession();
        Query query = session.createQuery("FROM Customer C");
        return query.list();
    }

    public void remove(Customer cust) {
        Session session = dbc.getSession();
        session.beginTransaction();
        session.delete(cust);
        session.getTransaction().commit();
    }
}
