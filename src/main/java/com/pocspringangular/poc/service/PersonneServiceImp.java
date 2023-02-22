package com.pocspringangular.poc.service;

import com.pocspringangular.poc.model.Personne;
import com.pocspringangular.poc.repository.PersonneRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonneServiceImp implements  PersonneService{

    // injection par constructeur
    private final PersonneRepository personneRepository;

    @Override
    public Personne create(Personne personne) {
        return personneRepository.save(personne);
    }

    @Override
    public List<Personne> read() {
        return personneRepository.findAll();
    }

    @Override
    public Personne update(Long Id, Personne personne) {
        return personneRepository.findById(Id)
                .map(p ->
                    { p.setNom(personne.getNom());
                     p.setPrenom(personne.getPrenom());
                     p.setAdresse(personne.getAdresse());
                     return personneRepository.save(p) ;
                }).orElseThrow(() -> new RuntimeException("Personne non trouvé"));
    }

    @Override
    public String delete(Long Id) {
        personneRepository.deleteById(Id);
        return "Personne supprimé";
    }
}
