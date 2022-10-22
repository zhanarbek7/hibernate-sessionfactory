package com.hibernate.sessionFactory;

import com.hibernate.sessionFactory.entity.Person;
import com.hibernate.sessionFactory.service.PersonServiceImpl;
import com.hibernate.sessionFactory.util.DbConnection;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonServiceImpl personService = new PersonServiceImpl();
    }


}