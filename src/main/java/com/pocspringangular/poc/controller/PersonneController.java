package com.pocspringangular.poc.controller;

import com.pocspringangular.poc.model.Personne;
import com.pocspringangular.poc.service.PersonneService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/personne")
@AllArgsConstructor
public class PersonneController {
    private PersonneService personneService;

    @PostMapping ("/create")
    public Personne create (@RequestBody Personne personne) {
        return personneService.create(personne);
    }

    @GetMapping ("/read")
    public List<Personne> read() {
        return personneService.read();
    }

    @PutMapping("/update/{id}")
    public Personne update (Long Id, Personne personne) {
        return personneService.update(Id, personne);
    }

    @DeleteMapping ("/delete")
    public String delete (@PathVariable Long id) {
        return personneService.delete(id);
    }

}
