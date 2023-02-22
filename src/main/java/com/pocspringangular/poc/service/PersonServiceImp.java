package com.pocspringangular.poc.service;

import com.pocspringangular.poc.model.Person;
import com.pocspringangular.poc.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonServiceImp implements PersonService {

    // injection par constructeur
    private final PersonRepository personRepository;

    @Override
    public Person create(Person person) {
        return personRepository.save(person);
    }

    @Override
    public List<Person> read() {
        return personRepository.findAll();
    }

    @Override
    public Person update(Long Id, Person person) {
        return personRepository.findById(Id)
                .map(p ->
                    { p.setEmail(person.getEmail());
                     p.setFirstname(person.getFirstname());
                     p.setLastname(person.getLastname());
                     p.setAdress(person.getAdress());
                     p.setCity(person.getCity());
                     p.setZipcode(person.getZipcode());
                     p.setCountry(person.getCountry());
                     p.setPhonenumber(person.getPhonenumber());
                     p.setDateofbirth(person.getDateofbirth());
                     return personRepository.save(p) ;
                }).orElseThrow(() -> new RuntimeException("Personne non trouvé"));
    }

    @Override
    public String delete(Long Id) {
        personRepository.deleteById(Id);
        return "Personne supprimé";
    }
}

