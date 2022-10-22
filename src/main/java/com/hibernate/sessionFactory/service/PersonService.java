package com.hibernate.sessionFactory.service;

import com.hibernate.sessionFactory.entity.Person;

import java.util.List;

public interface PersonService {

    void insertIntoPerson(Person p);

    void update(Long id);

    void delete(Long id);

    Person getById(Long id);

    List<Person> getPeople();
}
