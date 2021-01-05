package com.event.enterpirse.dao;

import com.event.enterpirse.dto.Person;

/**
 * interface with methods
 */
public interface IPersonDAO {
    Person save(Person person) throws Exception;
}
