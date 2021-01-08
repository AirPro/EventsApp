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

    @RequestMapping("/")
    public String index() {
        personService.fetchAll();
        return "start";
    }

    @GetMapping("/person")
    @ResponseBody
    public List<Person> fetchAllPersons() {
        return personService.fetchAll();
    }

    @GetMapping("/person/id/")
    public ResponseEntity fetchPersonById(@PathVariable("id") String id) {
        Person foundPerson = personService.fetchById(Integer.parseInt(id));
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity(foundPerson, HttpStatus.OK);
    }

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
