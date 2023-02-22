package com.pocspringangular.poc.controller;

import com.pocspringangular.poc.model.Person;
import com.pocspringangular.poc.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping ("/personne")
@AllArgsConstructor
public class PersonController {
    private PersonService personService;

    @PostMapping ("/create")
    public Person create (@RequestBody Person person) {

        return personService.create(person);
    }

    @GetMapping ("/read")
    public List<Person> read() {
        return personService.read();
    }

    @PutMapping("/update/{id}")
    public Person update (Long Id, Person person) {
        return personService.update(Id, person);
    }

    @DeleteMapping ("/delete")
    public String delete (@PathVariable Long id) {
        return personService.delete(id);
    }

}
