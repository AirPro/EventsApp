package com.event.enterpirse;

import com.event.enterpirse.dao.IPersonDAO;
import com.event.enterpirse.dto.Person;
import com.event.enterpirse.service.IPersonService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class EnterpriseApplicationTests {

    @Autowired
    private IPersonService personService;
    private Person person;

    @MockBean
    private IPersonDAO personDAO;

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
        Mockito.when(personDAO.save(person)).thenReturn(person);
    }

    private void whenSearchPersonWithId1() {

        person = personService.fetchById(1);
    }

    private void thenReturnOnePersonForId1() {
        String lastName = person.getLastName();
        assertEquals("Freid", lastName);
    }

    @Test
    void savePerson_validationReturnEventWithFirstNameAndLastName() {
        givenPersonDataAreAvailable();
        whenUserCreatesNewPersonAndSaves();
        thenCreateNewPersonRecordAndReturnIt();
    }

    private void whenUserCreatesNewPersonAndSaves() {
        person.setFirstName("Robert");
        person.setLastName("Freid");
    }

    private void thenCreateNewPersonRecordAndReturnIt() {
        Person createdPerson = personService.save(person);
    }
}
