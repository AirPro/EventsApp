package com.event.enterpirse;

import com.event.enterpirse.dto.Person;
import com.event.enterpirse.service.IPersonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class EnterpriseApplicationTests {

    @Autowired
    private IPersonService personService;
    private Person person;

    @Test
    void conextLoads(){

    }

    @Test
    void fetchEventById_ReturnsPersonById1(){
        givenPersonDataAreAvailable();
        whenSearchPersonWithId1();
        thenReturnOnePersonForId1();
    }

    private void givenPersonDataAreAvailable() {
    }

    private void whenSearchPersonWithId1() {

        person = personService.fetchById(1);
    }

    private void thenReturnOnePersonForId1() {
        String lastName = person.getLastName();
        assertEquals("Freid", lastName);
    }
}
