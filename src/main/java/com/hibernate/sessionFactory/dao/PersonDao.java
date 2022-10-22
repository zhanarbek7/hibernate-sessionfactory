package com.hibernate.sessionFactory.dao;

import com.hibernate.sessionFactory.entity.Person;
import com.hibernate.sessionFactory.util.DbConnection;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public interface PersonDao {
    void insertIntoPerson(Person p);

    void update(Long id);

    void delete(Long id);

    Person getById(Long id);

    List<Person> getPeople();
}
