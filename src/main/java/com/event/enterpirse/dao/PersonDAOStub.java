package com.event.enterpirse.dao;

import com.event.enterpirse.dto.Person;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class PersonDAOStub implements IPersonDAO {

    Map<Integer, Person> allPersons = new HashMap<>();

    @Override
    public Person save(Person person) throws Exception {
        Integer personID = person.getPersonId();
        allPersons.put(personID, person);
        return person;
    }

    @Override
    public List<Person> fetchAll() {
        List<Person> returnPersons = new ArrayList(allPersons.values());
        return returnPersons;
    }

    @Override
    public Person fetch(int id) {
        return allPersons.get(id);
    }

    @Override
    public void delete(int id) {
        allPersons.remove(id);
    }
}
