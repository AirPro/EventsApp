package com.event.enterpirse.dao;

import com.event.enterpirse.dto.Person;

import java.util.List;

/**
 * interface with methods
 */
public interface IPersonDAO {
    Person save(Person person) throws Exception;

    List<Person> fetchAll();

    Person fetch(int id);

    void delete(int id);
}
