package com.hibernate.sessionFactory.service;

import com.hibernate.sessionFactory.dao.PersonDao;
import com.hibernate.sessionFactory.dao.PersonDaoImpl;
import com.hibernate.sessionFactory.entity.Person;

import java.util.List;

public class PersonServiceImpl implements PersonService{

    PersonDao personDao = new PersonDaoImpl();

    @Override
    public void insertIntoPerson(Person p) {
        personDao.insertIntoPerson(p);
    }

    @Override
    public void update(Long id) {
        personDao.update(id);
    }

    @Override
    public void delete(Long id) {
        personDao.delete(id);
    }

    @Override
    public Person getById(Long id) {
        return personDao.getById(id);
    }

    @Override
    public List<Person> getPeople() {
        return personDao.getPeople();
    }
}
