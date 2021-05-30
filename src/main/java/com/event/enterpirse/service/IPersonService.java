package com.event.enterpirse.service;

import com.event.enterpirse.dto.Event;
import com.event.enterpirse.dto.Person;

import java.io.IOException;
import java.util.List;

public interface IPersonService {
    /**
     * Fetch a person with a given Id
     * @param id a unique identifier for a person.
     * @return the matching person, or null if no matches found.
     */
    Person fetchById(int id);

    void delete(int id) throws Exception;

    Person save(Person person) throws Exception;

    List<Person> fetchAll();

    List<Event> fetchEvents(String combinedName) throws IOException;
}
