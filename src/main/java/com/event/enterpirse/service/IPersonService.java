package com.event.enterpirse.service;

import com.event.enterpirse.dto.Person;

import java.util.List;

public interface IPersonService {
    /**
     * Fetch a person with a given Id
     * @param id a unique identifier for a person.
     * @return the matching person, or null if no matches found.
     */
    Person fetchById(int id);

    Person save(Person person) throws Exception;

    List<Person> fetchAll();
}
