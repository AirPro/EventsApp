package com.event.enterpirse;

import com.event.enterpirse.dto.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class EventsApplicationController {
    @RequestMapping("/")
    public String index() {
        return "start";
    }

    @GetMapping("/person")
    public ResponseEntity fetchAllPersons() {
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/person/id/")
    public ResponseEntity fetchPersonById(@PathVariable("id") String id) {
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping(value="/person", consumes="application/jason", produces="application/jason")
    public Person createPerson(@RequestBody Person person) {
        return person;
    }

    @DeleteMapping("/person.id/")
    public ResponseEntity deletePerson(@PathVariable("id") String id) {
        return new ResponseEntity(HttpStatus.OK);
    }
}
