package com.event.enterpirse.service;

import com.event.enterpirse.dao.IPersonDAO;
import com.event.enterpirse.dto.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceStub implements IPersonService{

    @Autowired
    private IPersonDAO personDAO;

    /**
     * Default Constructor
     */
    public PersonServiceStub() {

    }

    /**
     * overrides default constructor if present
     * @param personDAO
     */
    public PersonServiceStub(IPersonDAO personDAO) {

        this.personDAO = personDAO;
    }

    /**
     * populate class for test driven design
     * @param id a unique identifier for a person.
     * @return
     */
    @Override
    public Person fetchById(int id) {
        Person foundPerson = personDAO.fetch(id);
        return foundPerson;
    }

    public void delete(int id) throws Exception{
        personDAO.delete(id);
    }

    @Override
    public Person save(Person person) throws Exception{
        return personDAO.save(person);
    }

    @Override
    public List<Person> fetchAll() {
        return personDAO.fetchAll();
    }
}
