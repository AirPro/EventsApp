package com.event.enterpirse;

import com.event.enterpirse.dto.Person;
import com.event.enterpirse.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EventsApplicationController {

    @Autowired
    IPersonService personService;

    /**
     * Handle the root (/) endpoint and return a start page.
     * @return
     */
    @RequestMapping("/")
    public String index() {
        personService.fetchAll();
        return "start";
    }

    /**
     * Handle returning all Person in the database
     * @return
     */
    @GetMapping("/person")
    @ResponseBody
    public List<Person> fetchAllPersons() {
        return personService.fetchAll();
    }

    /**
     * Fetch a person with the given ID.
     *
     * Given the parameter id, find a person that corresponds to this unique ID.
     *
     * Returns one of the following status codes:
     * 200: person found
     * 400: person not found
     *
     * @param id a unique identifier for this person
     */
    @GetMapping("/person/id/")
    public ResponseEntity fetchPersonById(@PathVariable("id") String id) {
        Person foundPerson = personService.fetchById(Integer.parseInt(id));
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity(foundPerson, headers, HttpStatus.OK);
    }

    /**
     * Create a new person object, given the data provided.
     *
     * returns one of the following status codes:
     * 201: successfully created a new person.
     * 409: unable to create a person, because it already exists.
     *
     * @param person a JSON representation of a person object.
     * @return the newly created person object.
     */
    @PostMapping(value="/person", consumes="application/jason", produces="application/jason")
    public Person createPerson(@RequestBody Person person) throws Exception {
        Person newPerson = null;
        try {
            newPerson = personService.save(person);
        } catch (Exception e) {
            // TODO add logging
        }
        return newPerson;
    }

    /**
     * Delete a person from the database
     * @param id
     * @return
     */
    @DeleteMapping("/person.id/")
    public ResponseEntity deletePerson(@PathVariable("id") String id) {
        try {
            personService.delete(Integer.parseInt(id));
            return new ResponseEntity(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
