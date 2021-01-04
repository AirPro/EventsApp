package com.event.enterpirse.service;

import com.event.enterpirse.dto.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonServiceStub implements IPersonService{

    @Override
    public Person fetchById(int id) {
        Person person = new Person();
        person.setLastName("Freid");
        person.setPersonId(1);
        return person;
    }
}
