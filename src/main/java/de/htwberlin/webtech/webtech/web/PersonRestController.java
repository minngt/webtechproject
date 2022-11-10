package de.htwberlin.webtech.webtech.web;

import de.htwberlin.webtech.webtech.web.api.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonRestController {

    private List<Person> persons;

    public PersonRestController() {
        persons = new ArrayList<>();
        persons.add(new Person(1, "Max", "Mustermann", false));
        persons.add(new Person(2, "Maxima", "Meier", true));
    }

    @GetMapping(path = "/api/v1/persons")
    public ResponseEntity<List<Person>> fetchPerson(){
        return ResponseEntity.ok(persons);
    }

}
