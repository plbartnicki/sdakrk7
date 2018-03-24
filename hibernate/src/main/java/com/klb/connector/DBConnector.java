package com.klb.connector;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Created by klb on 24.03.18.
 */
public class DBConnector {

    // z tego beda korzystaly serwisy do robienia operacji na BD
    private static Session session;

    private static DBConnector dbConnector = null;
    private  SessionFactory sessionFactory = null;

    private DBConnector() {
        Configuration conf = new Configuration();

        //budujemy fabryke sesji - pomocniczy obiekt z ktorego pozniej otrzymamy sesje
        sessionFactory = conf.configure().buildSessionFactory();


        session = sessionFactory.openSession();
    }

    public static DBConnector getInstance() {
        if(dbConnector == null) {
            dbConnector = new DBConnector();
        }

        return dbConnector;
    }

    public Session getSession() {
        return session;
    }

    public void close() {
        session.close();
        sessionFactory.close();

    }
}
