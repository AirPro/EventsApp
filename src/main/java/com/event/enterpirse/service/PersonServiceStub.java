package com.event.enterpirse.service;

import com.event.enterpirse.dao.IPersonDAO;
import com.event.enterpirse.dto.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonServiceStub implements IPersonService{

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
        Person person = new Person();
        person.setLastName("Freid");
        person.setPersonId(1);
        return person;
    }

    @Override
    public Person save(Person person) throws Exception{
        return personDAO.save(person);
    }
}
