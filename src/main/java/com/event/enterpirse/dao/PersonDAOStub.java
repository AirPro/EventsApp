package com.event.enterpirse.dao;

import com.event.enterpirse.dto.Person;

import java.util.ArrayList;
import java.util.List;

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
