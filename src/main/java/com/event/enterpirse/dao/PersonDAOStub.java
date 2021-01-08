package com.event.enterpirse.dao;

import com.event.enterpirse.dto.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonDAOStub implements IPersonDAO {

    List<Person> allPersons = new ArrayList<Person>();

    @Override
    public Person save(Person person) throws Exception {
        allPersons.add(person);
        return person;
    }

    @Override
    public List<Person> fetchAll() {
        return allPersons;
    }
}
