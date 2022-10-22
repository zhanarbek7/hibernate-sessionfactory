package com.hibernate.sessionFactory.dao;

import com.hibernate.sessionFactory.entity.Person;
import com.hibernate.sessionFactory.util.DbConnection;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class PersonDaoImpl implements PersonDao{
    @Override
    public void insertIntoPerson(Person p) {
        try (SessionFactory sessionFactory = DbConnection.buildSessionFactory()) {
            Session session = sessionFactory.openSession();
            session.getTransaction().begin();
            session.persist(p);
            session.getTransaction().commit();
        }
    }

    @Override
    public void update(Long id) {
        try (SessionFactory sessionFactory = DbConnection.buildSessionFactory()) {
            Session session = sessionFactory.openSession();
            session.getTransaction().begin();

            Person person1 = session.get(Person.class, id);
            person1.setName("Java8");

            session.saveOrUpdate(person1);

            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(Long id) {
        try (SessionFactory sessionFactory = DbConnection.buildSessionFactory()) {
            Session session = sessionFactory.openSession();
            session.getTransaction().begin();

            Person person1 = session.get(Person.class, id);


            session.remove(person1);

            session.getTransaction().commit();
        }
    }

    @Override
    public Person getById(Long id) {
        try (SessionFactory sessionFactory = DbConnection.buildSessionFactory()) {
            Session session = sessionFactory.openSession();
            session.getTransaction().begin();

            Person person1 = session.get(Person.class, id);

            session.getTransaction().commit();
            return person1;
        }
    }

    @Override
    public List<Person> getPeople() {
        try (SessionFactory sessionFactory = DbConnection.buildSessionFactory()) {
            Session session = sessionFactory.openSession();
            session.getTransaction().begin();

            List<Person> people = session.createQuery("select p from Person p").getResultList();
            session.getTransaction().commit();
            return people;
        }
    }
}
